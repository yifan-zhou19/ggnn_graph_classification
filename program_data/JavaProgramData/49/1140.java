package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		char c;
		char e;
		int d;
		int i;
		int j;
		int k;
		int p;
		s = new Scanner(System.in).nextLine();
		int m = s.length();
		for (k = 2;k <= m;k++)
		{
						for (i = 0;i <= (m - k);i++)
						{
												   for (j = i;j < (i + (k) / 2);j++)
												   {
																	   d = 0;
																	   if (s.charAt(j) != s.charAt(k + i - 1 - (j - i)))
																	   {
																						 d = 1;
																						 break;
																	   }
												   }
												   if (d == 0)
												   {
														   System.out.print("\n");
														   for (p = i;p < i + k;p++)
														   {
																			 System.out.printf("%c",s.charAt(p));
														   }
												   }
						}
		}
		 return 0;
	}

}
