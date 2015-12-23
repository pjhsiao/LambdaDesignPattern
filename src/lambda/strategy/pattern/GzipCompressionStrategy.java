package lambda.strategy.pattern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompressionStrategy implements lambda.strategy.pattern.CompressionStrategy {

	@Override
	public OutputStream compress(OutputStream data) throws IOException {
		return new GZIPOutputStream(data);
	}

}
