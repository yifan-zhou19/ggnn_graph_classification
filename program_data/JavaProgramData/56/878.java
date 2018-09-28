package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int[] a = new int[5];
		int k = 0;
		int i;
		int t;
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		n = m;
		while (m >= 1)
		{
			m = m / 10;
			k++;
		}

		for (i = 0;i < k;i++)
		{
			t = n - n / 10 * 10;
			System.out.printf("%d",t);
			n = n / 10;
		}
		System.out.print("\n");




	}

}

