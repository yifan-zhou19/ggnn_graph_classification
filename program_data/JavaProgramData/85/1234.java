package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int l;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			e = 0;
			str = new Scanner(System.in).nextLine();
			l = str.length();
			for (j = 0;j < l;j++)
			{
			a = 0;
			b = 0;
			c = 0;
			d = 0;
				if (str.charAt(j) > 64 && str.charAt(j) < 91)
				{
					a = 1;
				}
				if (str.charAt(j) > 96 && str.charAt(j) < 123)
				{
					b = 1;
				}
				if (str.charAt(j) > 47 && str.charAt(j) < 58)
				{
					c = 1;
				}
				if (str.charAt(j) == 95)
				{
					d = 1;
				}
				if (a == 0 && b == 0 && c == 0 && d == 0)
				{
					e = 1;
					break;
				}
			}
			if (e == 1)
			{
				System.out.print("no\n");
			}
			if (e == 0)
			{
				if (str.charAt(0) > 47 && str.charAt(0) < 58)
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.print("yes\n");
				}
			}


		}



	}
}

