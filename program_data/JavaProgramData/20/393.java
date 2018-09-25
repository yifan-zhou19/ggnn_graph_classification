package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str = new String(new char[11]);
		 String substr = new String(new char[4]);
		 String string = new String(new char[14]);
		 String p;
		 int i;
		 int index;
		 while (scanf("%s%s",str,substr) != EOF)
		 {
			 p = str;
			 for (i = 1;str.charAt(i);i++)
			 {

				 if (str.charAt(i) > p)
				 {
					 index = i;
					 p = str.charAt(i);
				 }
			 }
				 String[0] = '\0';
				 strncat(String,str,index + 1);
				 String += substr;
				 String += p.Substring(1);
				 System.out.printf("%s\n",String);
		 }
	return 0;
	}







}
