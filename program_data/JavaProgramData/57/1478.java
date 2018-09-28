package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int l;
		int k;
		String s = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if (s.charAt(l - 1) == 'r' && s.charAt(l - 2) == 'e')
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));

				}
				System.out.print("\n");
			}
				else if (s.charAt(l - 1) == 'y' && s.charAt(l - 2) == 'l')
				{
					for (k = 0;k < l - 2;k++)
					{
						System.out.printf("%c",s.charAt(k));

					}
					  System.out.print("\n");
				}
					else if (s.charAt(l - 1) == 'g' && s.charAt(l - 2) == 'n' && s.charAt(l - 3) == 'i')
					{
						for (p = 0;p < l - 3;p++)
						{
							System.out.printf("%c",s.charAt(p));

						}
						System.out.print("\n");
					}
						else
						{
							System.out.println(s);
						}
		}
					return 0;
	}


}

