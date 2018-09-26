package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int h;
		int i;
		int j;
		int k;
		int l;
		int length;
		int mark;
		String str = new String(new char[100]);
		String x = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 2;i < length;i++)
		{
			for (j = 0;j <= (length - i);j++)
			{
				m = j;
				for (k = 0;k < i;k++,j++)
				{
					x = tangible.StringFunctions.changeCharacter(x, k, str.charAt(j));
				}
				mark = 0;
				if (i % 2 == 0)
				{
					for (l = 0;l < (i / 2);l++)
					{
						if (x.charAt(l) == x.charAt((i - l - 1)))
						{
							mark = mark + 1;
						}
						else
						{
							break;
						}
					}
					if (mark == (i / 2))
					{
						for (h = 0;h < i;h++)
						{
							if (h == (i - 1))
							{
								System.out.printf("%c\n",x.charAt(h));
							}
							else
							{
								System.out.printf("%c",x.charAt(h));
							}
						}
					}
				}
				if (i % 2 != 0)
				{
					for (l = 0;l < (i / 2);l++)
					{
						if (x.charAt(l) == x.charAt((i - l - 1)))
						{
							mark = mark + 1;
						}
						else
						{
							break;
						}
					}
					if (mark == (i / 2))
					{
						for (h = 0;h < i;h++)
						{
							if (h == (i - 1))
							{
								System.out.printf("%c\n",x.charAt(h));
							}
							else
							{
								System.out.printf("%c",x.charAt(h));
							}
						}
					}
				}
				j = m;
			}
		}
		return 0;
	}

}

