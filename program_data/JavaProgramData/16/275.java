package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m = 0;
		int i;
		int[] a = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			a[m] = n % 10;
			n /= 10;
			m++;
		}while (n > 0);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
	}
}

