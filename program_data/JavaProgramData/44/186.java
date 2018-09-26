package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int s = 0;
		int i;
		while (x != 0)
		{
			i = x % 10;
			s = s * 10 + i;
			x = x / 10;
		}
		return s;
	}
	public static int Main()
	{
		int n = 0;
		int i;
		int j = 0;
		char a;
		for (i = 0;i < 6;i++)
		{
			n = 0;
			j = 0;
			while (true)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					a = tempVar.charAt(0);
				}
				if (a == '\n')
				{
					break;
				}
				if (a == '-')
				{
					j = 1;
				}
				else
				{
					n = n * 10 + (a - '0');
				}
			}
			n = reverse(n);
			if (j == 1)
			{
				System.out.print("-");
			}
			System.out.printf("%d\n",n);
		}
	}
}

