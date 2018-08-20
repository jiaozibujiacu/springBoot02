package com.jiaozi.until;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {

	public static void main(String[] args) throws IOException {
		Document doc=null;
		try {
           
			doc= Jsoup.connect("http://datachart.500.com/gdsyxw/").header("Accept", "*/*").header("Accept-Encoding", "gzip, deflate")
				.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
				.header("Referer", "https://www.baidu.com/")
				.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
				.timeout(1000)
				.get();
        // 修改http包中的header,伪装成浏览器进行抓取

        } catch (IOException e) {
            e.printStackTrace();
        }
		if(doc!=null) {
			
			Element main = doc.getElementById("chartsTable").getElementsByTag("tbody").first();
			
			Elements testElement = main.getElementsByTag("tr");
			
			for(Element test :testElement) {

				
				if(test.select("td.chartBall01")!=null ) {
					System.out.println( test.select("td[align]").text()+"号码数为："+test.select("td.chartBall01").text()+"2222222222");
				}
			}
			
				
					
					
			
			
			  
		}
		
      
	}

}
