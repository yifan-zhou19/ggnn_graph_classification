package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String article = new String(new char[40]);
		int i = 0;
		int k = 0;
		article = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = article.length();
		System.out.print(article);
		while (k < number - 1)
		{
			 article = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			 char * p = article;
			 i = i + article.length() + 1;
			 if (i <= 80)
			 {
				  //cout << " " << article;
				  System.out.print(" ");
				  for (; * p != '\0'; p++)
				  {
					  System.out.print(p);
				  }
			 }
			 else
			 {
				  System.out.print("\n");
				  System.out.print(article);
				  i = article.length();
			 }
			 ++k;
		}
		return 0;
	}

}

