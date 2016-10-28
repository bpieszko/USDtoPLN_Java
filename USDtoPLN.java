import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.awt.EventQueue;

public class USDtoPLN {
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AppFrame();
				Timer timer = new Timer();
				timer.scheduleAtFixedRate(new TimerTask() {
					@Override
					public void run() {
						Connection connect = Jsoup.connect("http://pl.investing.com/currencies/usd-pln").userAgent("Mozilla");
						Document document = null;
						try {
							document = connect.get();
						} catch (IOException exception) {
							System.out.println("connect.get problem");
						}

						Elements es = document.select("span#last_last");
						Element ex = null;
						for (Element e : es)
							ex = e;

						AppFrame.val.setText(ex.text());
					}
				}, 0, 100);
			}
		});
		
	}
}