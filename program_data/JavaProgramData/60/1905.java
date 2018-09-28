package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		int i;
		int k;
		for (k = 0,i = 2;i <= Math.sqrt(x) + 1;i++)
		{
			if (x % i == 0)
			{
				k++;
			}
		}
		if (k == 0)
		{
		return (1);
		}
		else
		{
		return (0);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3,k = 0;i <= n - 2;i = i + 2)
		{

			if (judge(i) == 1 && judge(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty\n");
		}

	}


}

