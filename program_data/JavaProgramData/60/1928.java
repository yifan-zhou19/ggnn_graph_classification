package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q = 0;
		int judge = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 3;i <= n - 2;i += 2)
		{
			if (judge(i) != 0 && judge(i + 2) != 0)
			{
				System.out.printf("%d %d",i,i + 2);
				q = 1;
				System.out.print("\n");
			}
		}
		if (q == 0)
		{
		   System.out.print("empty");
		}
	}
	public static int judge(int x)
	{
		int p = 1;
		for (int i = 2;i <= Math.sqrt((double)x);i++)
		{
			if (x % i == 0)
			{
			   p = 0;
			   break;
			}
		}
		if (p == 1)
		{
		   return 1;
		}
		else
		{
		   return 0;
		}
	}
}

