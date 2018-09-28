package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int t;
			int i;
			int j;
			int k;
			int h;
			int s;
			int n = 0;
		char[][] m = new char[100][10000];
		String b = new String(new char[100]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t = Integer.parseInt(tempVar);
			}
			for (i = 0;i < t;i++)
			{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						m[i] = tempVar2.charAt(0);
					}
					n = 0;
				   h = String.valueOf(m[i]).length();
					for (j = 0;j <= h - 1;j++)
					{
							n = 0;
							for (k = 0;k <= h - 1;k++)
							{
									if ((m[i][j] == m[i][k]) && (j != k))
									{
											n = 1;
											break;
									}

							}
						if (n == 0)
						{
									b = tangible.StringFunctions.changeCharacter(b, i, m[i][j]);
									 break;
						}

					}
					if (n == 1)
					{
								 b = tangible.StringFunctions.changeCharacter(b, i, 1);
					}
			}
			for (s = 0;s <= t - 1;s++)
			{
					if (b.charAt(s) == 1)
					{
							System.out.print("no\n");
					}
					else
					{
							System.out.printf("%c\n",b.charAt(s));
					}
			}
			return 0;
	}

}

