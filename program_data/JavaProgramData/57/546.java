package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[35]);
		int n;
		int i;
		int l;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			l = str.length();
			switch (str.charAt(l - 1))
			{
			case'r':
				for (a = 0;a < l - 2;a++)
				{
					   System.out.printf("%c",str.charAt(a));
				}
				System.out.print("\n");
				break;
			case'y':
				for (b = 0;b < l - 2;b++)
				{
					   System.out.printf("%c",str.charAt(b));
				}
							System.out.print("\n");
				break;
			case'g':
				for (c = 0;c < l - 3;c++)
				{
					   System.out.printf("%c",str.charAt(c));
				}
							System.out.print("\n");
				break;
			}
		}
	}

}

