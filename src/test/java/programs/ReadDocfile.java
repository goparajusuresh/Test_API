package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ReadDocfile {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:/Users/SureshGoparaju/Downloads/note.doc"); // ==>gives you user downloads path
		String path = loc.toString();

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		try {
			XWPFDocument doc = new XWPFDocument(fis);
			XWPFWordExtractor extract = new XWPFWordExtractor(doc);
			System.out.println(extract.getText());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
