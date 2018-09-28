package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int n;
		int b;
		int i;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; n != 0; i++)
		{
			a[i] = n % 10;
			n = n / 10;
			b = b + 1;
		}
		for (i = 0; i < b; i++)
		{
			System.out.printf("%d",a[i]);
		}
	}

}

