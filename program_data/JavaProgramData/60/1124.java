package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int t = 1;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				t = 0;
			}
		}
		return t;
	}
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 4;i <= n;i++)
		{
			a = i - 2;
			b = i;
			if (sushu(a) != 0 && sushu(b) != 0)
			{
				t = 1;
				System.out.printf("%d %d\n",a,b);
			}
		}
		if (t == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

