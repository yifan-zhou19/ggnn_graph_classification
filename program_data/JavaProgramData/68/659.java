package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		for (i = 2;i <= (int)Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i == (int)Math.sqrt(a) + 1)
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

