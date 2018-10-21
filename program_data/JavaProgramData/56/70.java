package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int N;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	N = (int)(Math.log10(n)) + 1;
		for (i = 0;i < N;i++)
		{
			a[i] = n % 10;
			n = (n - a[i]) / 10;
			System.out.printf("%d",a[i]);
		}


	   return 0;
	}
}

