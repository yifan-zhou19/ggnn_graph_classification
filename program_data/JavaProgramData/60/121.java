package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int j = 0;
		for (i = 2;i <= x / 2;i++)
		{
			if (x % i == 0)
			{
				j = j + 1;
			}
		}
			if (j == 0)
			{
				return 1;
			}
			else
			{
				return 0;
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
		for (i = 3;i < n - 1;i = i + 2)
		{
			if (sushu(i) == 1 && sushu(i + 2) == 1)
			{
				j = j + 1;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
			if (j == 0)
			{
				System.out.print("empty");
			}
	}
}

