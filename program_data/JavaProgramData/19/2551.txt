package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		char[][] sub = new char[101][101];
		int len = s.length();
		int m = 0;
		int n = 0;
		for (int i = 0;i < len;i++)
		{
				if (s.charAt(i) != ' ')
				{
						   sub[m][n] = s.charAt(i);
						   n++;
				}
				if (s.charAt(i) == ' ')
				{
						   m++;
						   n = 0;
				}
		}
		for (int j = 0;j <= m;j++)
		{
				if (strcmp(sub[j],a) == 0)
				{
						  if (j == 0)
						  {
								   System.out.printf("%s",b);
						  }
						  if (j != 0)
						  {
								   System.out.printf(" %s",b);
						  }
				}
				else
				{
						  if (j == 0)
						  {
								   System.out.printf("%s",sub[j]);
						  }
						  if (j != 0)
						  {
								   System.out.printf(" %s",sub[j]);
						  }
				}
		}
		return 0;
	}


}
