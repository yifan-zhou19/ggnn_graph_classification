package <missing>;

public class GlobalMembers
{
	public static int num = 1;
	public static int sushu(int n)
	{
		int i;
		int sum = 0;
		for (i = 1;i <= Math.sqrt(n * 1.0);i++)
		{
			if (n % i == 0)
			{
				sum++;
			}
		}
		if (sum == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void fenjie(int i,int k) //i???????k??????????? i?sqrt?n???
	{
		int mid;
		int j;
		mid = Math.sqrt(k * 1.0);
		for (j = i;j <= mid;j++)
		{
			if (sushu(k) != 0)
			{
				break;
			}
			else
			{
				if (k % j == 0)
				{
					num++;
					fenjie(j, k / j);
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			fenjie(2, a[i]);
			System.out.print(num);
			System.out.print("\n");
			num = 1;
		}
		return 0;
	}

}

