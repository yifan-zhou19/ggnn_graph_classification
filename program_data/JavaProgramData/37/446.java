package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int s;
		int f;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
						f = 0;
						s = 0;
						m = 0;
						String c = new String(new char[100000]);
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							c = tempVar2.charAt(0);
						}
						int l;
						l = c.length();
						int[] b = new int[100000];
						for (int q = 'a';q <= 'z';q++)
						{
								for (j = 0;j < l;j++)
								{
										if (c.charAt(j) == q)
										{
										b[m]++;
										}
								}
								m++;
						}
						String d = new String(new char[26]);
						for (m = 0;m < 26;m++)
						{
									 if (b[m] == 1)
									 {
										  d = tangible.StringFunctions.changeCharacter(d, s, m + 'a');
										  s++;
									 }
						}
						   for (j = 0;j < l;j++)
						   {
										for (m = 0;m < s;m++)
										{
												 if (c.charAt(j) == d.charAt(m))
												 {
															   System.out.printf("%c\n",c.charAt(j));
															   f = 1;
															   break;
												 }
										}
										if (f == 1)
										{
										break;
										}
						   }
						if (s == 0)
						{
						System.out.print("no\n");
						}
		}
	}
}

