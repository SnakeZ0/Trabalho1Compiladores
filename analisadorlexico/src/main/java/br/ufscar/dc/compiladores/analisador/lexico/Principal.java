package br.ufscar.dc.compiladores.analisador.lexico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            AnalisadorLexer lex = new AnalisadorLexer(cs);
            Token t = null;

            // Verificar se o diretório de saída existe, criar se necessário
            File outputFile = new File(args[1]);
            File outputDir = outputFile.getParentFile();
            if (outputDir != null && !outputDir.exists()) {
                outputDir.mkdirs();
            }

            FileWriter writer = new FileWriter(outputFile);
            String textoarq;

            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String tipo = AnalisadorLexer.VOCABULARY.getDisplayName(t.getType());
                String texto = t.getText();

                if (tipo.equals("ERRO")) {
                    textoarq = "Linha " + t.getLine() + ": erro - Comentário não fechado\n";
                    writer.write(textoarq);
                    break;
                } else if (tipo.equals("CADEIA__LITERAL_NAO_FECHADA")) {
                    textoarq = "Linha " + t.getLine() + ": erro - Cadeia literal não fechada\n";
                    writer.write(textoarq);
                    break;
                } else if (tipo.equals("COMENTARIO_NAO_FECHADO")) {
                    textoarq = "Linha " + t.getLine() + ": erro - Comentário não fechado\n";
                    writer.write(textoarq);
                    break;
                } else if (tipo.equals("PALAVRA_CHAVE")) {
                    tipo = "'" + texto.toLowerCase() + "'";
                }

                textoarq = "<'" + texto + "'," + tipo + ">\n";
                writer.write(textoarq);
            }

            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}