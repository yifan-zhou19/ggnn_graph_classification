package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int strNnum = 0;
		int strMnum = 0;
		int max;
		int min;
		int maxstr = 0;
		int minstr = 0;
		int i;
		int len;
		char[][] string = new char[50][20];
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

		max = min = String.valueOf(String[0]).length();
		for (i = 1;i <= strNnum;i++)
		{
		  len = String.valueOf(String[i]).length();
		  if (len > max)
		  {
			  maxstr = i;
			  max = len;
		  }
		  if (len < min)
		  {
			  minstr = i;
			  min = len;
		  }
		}
		System.out.printf("%s\n%s\n",string[maxstr],string[minstr]);
		return 0;
	}

}
