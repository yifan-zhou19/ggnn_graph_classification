package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum;
		int i;
		sum = 0;
		int[] a = new int[2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a[1] = i % 10;
			a[0] = (i - i % 10) / 10;
			if (a[1] != 7 && a[0] != 7 && i % 7 != 0)
			{
				sum = sum + Math.pow(i,2);
			}
		}
		System.out.printf("%d\n",sum);
	}
}

