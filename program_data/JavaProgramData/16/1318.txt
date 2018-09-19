package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		for (i = 1;n > 0;i++)
		{
			a[i] = n % 10;
			System.out.printf("%d",a[i]);
			n = n / 10;


		}

		return 0;
	}

}

