package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int flag = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				break;
			}
		}
		return flag;
	}
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 3;i < n - 1;i++)
			{
				if (sushu(i) + sushu(i + 2) == 2)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
	}
}

