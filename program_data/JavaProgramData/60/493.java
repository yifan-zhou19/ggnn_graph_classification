package <missing>;

public class GlobalMembers
{
	public static int judge(int i)
	{
		int j;
		int k1 = 0;
		for (j = 2;j <= Math.sqrt(i);)
		{
			if (i % j != 0)
			{
				j++;
			}
			else
			{
				break;
			}
		}
		if (j > Math.sqrt(i))
		{
			k1 = 1;
		}
		return (k1);
	}

	public static void Main()
	{
		int n;
		int k1;
		int k2;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 2;i <= n - 2;i++)
		{
			k1 = judge(i);
			k2 = judge(i + 2);
			if (k1 == 1 && k2 == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				sum++;
			}
		}
		if (sum == 0)
		{
			System.out.print("empty\n");
		}
	}



}

