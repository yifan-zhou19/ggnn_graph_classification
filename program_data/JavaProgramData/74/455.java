package <missing>;

public class GlobalMembers
{
	public static int IsPalindrome(int x)
	{
		int i;
		int num = 0;
		for (i = 0;x > 0;i++)
		{
			num = num * 10 + (x - (x / 10) * 10);
			x = x / 10;
		}
		return (num);
	}
	public static int IsPrime(int x)
	{
		int k;
		int i;
		k = Math.sqrt(x);
		for (i = 2;i <= k;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
			if (i >= k + 1)
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
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (i == IsPalindrome(i) && IsPrime(i) == 1)
			{
				break;
			}
		}
		for (j = m,k = 0;j <= n;j++)
		{
			if (j == IsPalindrome(j) && IsPrime(j) == 1)
			{
				if (j == i)
				{
					System.out.printf("%d",j);
					k++;
				}
				else
				{
					System.out.printf(",%d",j);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
	}




}

