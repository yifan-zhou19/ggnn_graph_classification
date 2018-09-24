package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int s;
		int i;
		if (n == 2)
		{
			return 1;
		}
		if (n == 3)
		{
			return 1;
		}
		s = 0;
		if (n % 2 == 0)
		{
			s = 1;
		}
		for (i = 3;i <= Math.sqrt(n);i = i + 2)
		{
			if ((sushu(i) == 1) && (n % i == 0))
			{
				s = 1;
				break;
			}
		}
		if (s == 0)
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
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j = j + 2)
		{
			for (i = 3;i <= j / 2;i = i + 2)
			{
				if ((sushu(i) == 1) && (sushu(j - i) == 1))
				{
					System.out.printf("%d=%d+%d\n",j,i,j - i);
					break;
				}
			}
		}
		return 0;
	}

}

