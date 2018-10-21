package <missing>;

public class GlobalMembers
{
	public static int outcome(int n)
	{
		int t;
		if (n % 2 == 0)
		{
			t = n / 2;
		}
		else
		{
			t = 3 * n + 1;
		}
		return (t);
	}
	public static void Main()
	{
		int n;
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n;
		for (i = 0;t != 1;i++)
		{
			if (t % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",t,outcome(t));
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",t,outcome(t));
			}
			t = outcome(t);
		}

		System.out.print("End");
	}
}

