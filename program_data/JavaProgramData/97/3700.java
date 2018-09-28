package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] wor = {100, 50, 20, 10, 5, 1};
		int[] num = new int[6];
		for (i = 0;i <= 5;i++)
		{
			num[i] = n / wor[i];
			n = n - num[i] * wor[i];
		}
		for (i = 0;i <= 5;i++)
		{
			System.out.printf("%d\n",num[i]);
		}
		return 0;
	}








}

