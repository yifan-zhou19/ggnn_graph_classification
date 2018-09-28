package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			b[i] = n / a[i];
			n = n % a[i];
		}
		b[5] = n;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}


}

