package lambda.strategy.pattern;

import java.io.File;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		Compressor gzipCompressor = new Compressor(GZIPOutputStream::new);
		gzipCompressor.compress(new File("outFile").toPath(), new File("outFile"));
		Compressor zipCompressor = new Compressor(ZipOutputStream::new); 
		zipCompressor.compress(new File("outFile").toPath(), new File("outFile"));
	}
}
