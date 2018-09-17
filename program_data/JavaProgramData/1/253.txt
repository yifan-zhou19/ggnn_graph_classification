package <missing>;

public class GlobalMembers
{
	public static int m = 2;
	public static int manners(int a)
	{ //????????????
		int count = 1;
		int t = 0;
		t = Math.sqrt((double) a);
		for (int i = m;i <= t;i++)
		{ //?????????
			if (a % i == 0)
			{
				m = i; //?????????????????????
				count = count + manners(a / i); //?????????????????
			}
		}
		return count; //?????
	}
	public static int Main()
	{
		int n;
		int b;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(manners(b));
			System.out.print("\n");
			m = 2; //?????
			i++;
		}
	   return 0;
	}
}

