package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int flag = 0;
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag != 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static void Main()
	{
		int n;
		int m;
		int p;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n / 2;
		for (i = 2;i <= m;i++)
		{
			p = n - i;
			 if (sushu(i) == 1 && sushu(p) == 1)
			 {
			   System.out.printf("%d %d\n",i,p);
			 }
		}
	}
}

