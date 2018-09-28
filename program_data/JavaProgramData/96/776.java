package <missing>;

public class GlobalMembers
{
	public static int num(char x)
	{
		int a;
		a = (int)x;
		a = a - 48;
		return a;
	}

	public static int Main()
	{
		String z = new String(new char[105]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = tempVar.charAt(0);
		}
		int i;
		int mid = num(z.charAt(0));
		int m;
		if ((z.charAt(2) == 0 && num(z.charAt(0)) * 10 + num(z.charAt(1)) < 13))
		{
			System.out.printf("0\n%d",num(z.charAt(0)) * 10 + num(z.charAt(1)));
		}
		else if (z.charAt(1) == 0)
		{
			System.out.printf("0\n%d",num(z.charAt(0)));
		}
		else
		{
			for (i = 1;z.charAt(i) != 0;i++)
			{
				mid = mid * 10;
				mid += num(z.charAt(i));
				m = 0;
				if (i == 1 && mid < 13)
				{
					continue;
				}
				while (mid >= 13)
				{
					m++;
					mid -= 13;
				}
				System.out.printf("%d",m);
			}
			System.out.print("\n");
			System.out.printf("%d",mid);
		}
		return 0;
	}


}

