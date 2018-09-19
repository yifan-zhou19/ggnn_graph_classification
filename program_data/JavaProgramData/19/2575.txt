package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int x;
		int y;
		int z;
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		x = s.length();
		y = a.length();
		z = b.length();
		for (i = 0;i < x;i++)
		{
			k = 1;
			if (i != 0)
			{
				if (s.charAt(i) == ' ')
				{
					k = 0;
					for (j = 0;j < y;j++)
					{
						if (s.charAt(i + j + 1) != a.charAt(j))
						{
							k = 1;
						}
					}
				}
				if (k == 0)
				{
					System.out.print(" ");
					for (j = 0;j < z;j++)
					{
						System.out.printf("%c",b.charAt(j));
					}
					i = i + y;
				}
				if (k == 1)
				{
					System.out.printf("%c",s.charAt(i));
				}
			}
			else if (i == 0)
			{
				k = 0;
				for (j = 0;j < y;j++)
				{
					if (s.charAt(j) != a.charAt(j))
					{
						k = 1;
					}
				}
				if (k == 0)
				{
					for (j = 0;j < z;j++)
					{
						System.out.printf("%c",b.charAt(j));
					}
					i = y - 1;
				}
				if (k == 1)
				{
					System.out.printf("%c",s.charAt(0));
				}
			}
		}
		return 0;
	}

}
