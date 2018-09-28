package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 3;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= 7;i += 2)
		{
			if (n % i == 0 && flag == 0)
			{
				System.out.printf("%d",i);
				flag = 1;
			}
			else if (n % i == 0 && flag == 1)
			{
				System.out.printf(" %d",i);
			}
			else
			{
				j--;
			}
		}
		if (j == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

