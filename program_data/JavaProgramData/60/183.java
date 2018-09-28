package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		int k;
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
			if (i >= k + 1)
			{
				return (1);
			}
				else
				{
					return (0);
				}
	}
	public static void Main()
	{
		int n;
		int[] a = new int[1500];
		int i;
		int j = 0;
		int k = 0;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			if (f(i) != 0)
			{
				a[j] = i;
				j++;
			}
		}
			for (k = 1;k < j;k++)
			{
				if (a[k] + 2 == a[k + 1])
				{
					System.out.printf("%d %d\n",a[k],a[k + 1]);
					flag = 0;
				}
			}
				if (flag != 0)
				{
					System.out.print("empty\n");
				}
	}
}

