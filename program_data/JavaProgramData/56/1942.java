package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			a[i] = n % 10;
			n = n / 10;
			i = i + 1;
		}
		while (j < i)
		{
			n = 10 * n + a[j];
			j = j + 1;
		}
		System.out.printf("%d",n);
	}


}

