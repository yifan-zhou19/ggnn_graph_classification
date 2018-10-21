package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int issu = int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n / 2;i++)
		{
			if (issu(i) != 0)
			{
				if (issu(n - i) != 0)
				{
					System.out.printf("%d %d\n",i,n - i);
				}
			}
		}
	}

	public static int issu(int k)
	{
		int j;
		int s;
		s = 1;
		for (j = 2;j < k;j++)
		{
			if (k % j == 0)
			{
				s = 0;
				return (s);
				break;
			}

		}
	}
}

