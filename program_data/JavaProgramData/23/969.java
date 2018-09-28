package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int strNnum = 0;
		int strMnum = 0;
		int max;
		int min;
		int maxstr = 0;
		int minstr = 0;
		int i;
		int len;
		char[][] string = new char[50][15];
		char ch;

		while ((ch = System.in.read()) != '\n')
		{
		 if (strMnum != 0 && (ch == ' '))
		 {
		   String[strNnum][strMnum] = '\0';
		   strNnum++;
		   strMnum = 0;
		 }
		 else
		 {
		  if (ch != ' ')
		  {
			String[strNnum][strMnum] = ch;
			strMnum++;
		  }
		 }
		}
		String[strNnum][strMnum] = '\0';
		for (i = strNnum;i > 0;i--)
		{
			System.out.printf("%s ",string[i]);
		}
		System.out.printf("%s",string[0]);

	}

}
