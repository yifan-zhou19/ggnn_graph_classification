package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			if (n < a[i])
			{
				System.out.print("0\n");
			}
			if (n >= a[i])
			{
				b[i] = n / a[i];
				n = n - b[i] * a[i];
				System.out.printf("%d\n",b[i]);
			}
		}
	}

}

