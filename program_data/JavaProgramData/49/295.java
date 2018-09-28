package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int j;
		int p = 2;
		int len;
		int flag;
		int m;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (m = 0;m < len;m++)
		{
			for (j = 0;(j < len - m) && (j >= 0);j++)
			{
				flag = 1;
				if (str.charAt(j) == str.charAt(j + m + 1))
				{
					if (j + 1 == j + m + 1)
					{
						System.out.printf("%c%c\n",str.charAt(j),str.charAt(j + 1));
					}
					else
					{
						for (p = 1;p <= m / 2;p++)
						{
							if (str.charAt(j + p) == str.charAt(j + m + 1 - p))
							{
								flag *= 1;
							}
							else
							{
								flag *= 0;
							}
						}
						if (flag == 1)
						{
							for (p = j;p <= j + m + 1;p++)
							{
								System.out.printf("%c",str.charAt(p));
							}
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}

}
