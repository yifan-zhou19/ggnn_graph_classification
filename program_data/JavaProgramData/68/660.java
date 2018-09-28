package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int temp;
		if (a == 2 || a == 3)
		{
			return 1;
		}
		if (a % 2 == 0)
		{
			return 0;
		}
		temp = (int)Math.sqrt(a);
		for (i = 3;i <= temp;i += 2)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > temp)
		{
			return 1;
		}
		return 0;
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j += 2)
		{
			System.out.printf("%d=",j);
		for (i = 2;i <= j / 2;i++)
		{
			if (sushu(i) != 0 && sushu(j - i) != 0)
			{
				System.out.printf("%d+%d\n",i,j - i);
				break;
			}
		}
		}
	}
}

