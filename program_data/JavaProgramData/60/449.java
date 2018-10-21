package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int k = 1;
		for (i = 2;i < n;i++)
		{
			if (n - (n / i) * i > 0)
			{
				k = k * 1;
			}
			else
			{
				k = k * 0;
			}
		}
		return (k);
	}
	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 5;i <= n;i++)
		{
			if ((sushu(i) > 0) && (sushu(i - 2) > 0))
			{
				System.out.printf("%d %d\n",i - 2,i);
				k = k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
	}

}

