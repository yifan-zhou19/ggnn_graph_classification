package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n;
		int[] a = new int[6];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 5;i++)
		{
			a[i] = n % 10;
			n = n / 10;

			m = m * 10 + a[i];
			if (n == 0)
			{
				break;
			}
		}
		System.out.printf("\n%d",m);
	}
}

