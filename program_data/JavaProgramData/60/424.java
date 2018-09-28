package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				return (0);
				break;
			}
			if (i == n - 1)
			{
				return (1);
			}
		}
		if (n == 1)
		{
			return (0);
		}
		if (n == 2)
		{
			return (1);
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n - 1;i++)
		{
			if (judge(i) != 0 && judge(i + 2) != 0)
			{
					System.out.printf("%d %d\n",i,i + 2);
					j++;
			}
		}
	if (j == 0)
	{
	System.out.print("empty");
	}
	}



}

