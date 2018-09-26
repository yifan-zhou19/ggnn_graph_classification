package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = {100, 50, 20, 10, 5, 1};
		int[] c = new int[6];
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c[0] = n - n % 100;
		c[1] = n - c[0] - (n - c[0]) % b[1];
		for (i = 2;i < 6;i++)
		{
			sum = sum + c[i - 1];
			c[i] = n - sum - c[0] - (n - sum - c[0]) % b[i];
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",c[i] / b[i]);
		}
		return 0;
	}

}

