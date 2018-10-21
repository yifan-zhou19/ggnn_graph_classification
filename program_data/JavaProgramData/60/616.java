package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 4;j <= n;j++)
		{
			if ((sushu(j - 2) == 1) && (sushu(j) == 1))
			{
				System.out.printf("%d %d\n",j - 2,j);
				a++;
			}
		}
		if (a == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

