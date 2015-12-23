package lambda.strategy.pattern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompressionStrategy implements lambda.strategy.pattern.CompressionStrategy {

	@Override
	public OutputStream compress(OutputStream data) throws IOException {
		return new ZipOutputStream(data);
	}

}
