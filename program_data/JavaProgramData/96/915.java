package <missing>;

public class GlobalMembers
{
	public static int change(char a,char b)
	{
		return 10 * (a - '0') + (b - '0');
	} //???????
	public static int shang(int x)
	{
		for (int i = 0;i < 10;i++)
		{
			if (i * 13 <= x != 0 && x < (i + 1) * 13)
			{
				return i;
			}
		}
	} //??????
	public static void coutt(int[] b, int num)
	{
		for (int i = 0;i < num;i++)
		{
			System.out.print(b[i]);
		}
			System.out.print("\n");
	} //????
	public static int Main()
	{
			final String a = "";
			int[] c = new int[102];
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a.length() == 1)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(a.charAt(0) - '0');
			}
			else if (a.length() == 2 && change(a.charAt(0), a.charAt(1)) < 13)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(change(a.charAt(0), a.charAt(1)));
			}
			else
			{
				int x = change(a.charAt(0), a.charAt(1));
				int yushu = 0;
				if (x < 13)
				{ //?????13
					x = x * 10 + a.charAt(2) - '0';
					for (int i = 0;i < a.length() - 2;i++)
					{
						c[i] = shang(x);
						if (i != a.length() - 3)
						{
							x = (x - c[i] * 13) * 10 + (a.charAt(i + 3) - '0');
						}
						else
						{
							yushu = x - c[i] * 13;
						}
					}
						coutt(c, a.length() - 2);
				}
				else
				{ //???????13
					for (int i = 0;i < a.length() - 1;i++)
					{
						c[i] = shang(x);
						if (i != a.length() - 2)
						{
							x = (x - c[i] * 13) * 10 + (a.charAt(i + 2) - '0');
						}
						else
						{
							yushu = x - c[i] * 13;
						}
					}
						coutt(c, a.length() - 1);
				}
					System.out.print(yushu);
					System.out.print("\n");
			}

			return 0;
	}

}

