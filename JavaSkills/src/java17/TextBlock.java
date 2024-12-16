package java17;

public class TextBlock {

	public static void main(String[] args) {
		
		//HTML data till java 8
		String htmlData = "<!DOCTYPE html>\r\n"
				+ " <html>\r\n"
				+ " <body>\r\n"
				+ "	 The content of the document......\r\n"
				+ " </body>\r\n"
				+ " </html>\r\n";
		
		System.out.println("htmlData: "+htmlData);
		/*-------Output -------------
			 htmlData: <!DOCTYPE html>
			 <html>
			 <body>
				 The content of the document......
			 </body>
			 </html>		  
		 * */
		
		//HTML After HTML data after java 17
		String htmlDataAfterJava17 = """
				<!DOCTYPE html>
                <html>
                <body>                                
				     The content of the document......
                </body>
                </html>
				""";
		
		System.out.println("HtmlData2: "+htmlDataAfterJava17);
		/*-------Output -------------
		 htmlData2: <!DOCTYPE html>
		 <html>
		 <body>
			 The content of the document......
		 </body>
		 </html>		  
	 * */
	}

}
