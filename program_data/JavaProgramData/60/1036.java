package <missing>;

public class GlobalMembers
{
	public static int sushu(int m)
	{
		int i;
		int s = 0;
		for (i = 2;i < m;i++)
		{
			if (m % i == 0)
			{
				s = 0;
				break;
			}
			else
			{
				s++;
			}
		}
		if (s != 0)
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
		int s;
		int i;
		int j;
		int k;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n - 1;i++)
		{
			s = sushu(i);
			if (s == 1)
			{
				k = i;
				k += 2;
				j = sushu(k);
				if (j == 1)
				{
					System.out.printf("%d %d\n",k - 2,k);
					l++;
				}
			}
		}
		if (l == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

