package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int y;
		int x = 0;
		int q = 0;
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String c = new String(new char[257]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
			for (j = 0;j < a.length();j++)
			{
				if (b.charAt(i) == a.charAt(j))
				{
					for (k = 0;k < b.length();k++)
					{
						if (b.charAt(i + k) == a.charAt(j + k))
						{
							x++;
						}
						if (x == b.length())
						{
							for (y = 0;y < j;y++)
							{
								System.out.printf("%c",a.charAt(y));
							}
							for (y = 0;y < c.length();y++)
							{
								System.out.printf("%c",c.charAt(y));
							}
							for (y = j + b.length();y < a.length();y++)
							{
								System.out.printf("%c",a.charAt(y));
							}
							q++;
							break;
						}
					}
				}
				if (q == 1)
				{
					break;
				}
				if (j == a.length() - 1)
				{
					System.out.printf("%s",a);
				break;
				}
			}
			return 0;
	}
}
