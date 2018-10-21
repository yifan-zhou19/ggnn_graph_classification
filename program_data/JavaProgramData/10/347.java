package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}

		for (i = 1;i <= n;i++)
		{
			b[i] = 1;

		for (j = 1;j < i;j++)
		{

		if (a[j] >= a[i] != 0 && b[j] + 1 > b[i])
		{

		 b[i] = b[j] + 1;
		}
		}

		if (sum < b[i])
		{
			sum = b[i];
		}

		}

		System.out.printf("%d\n",sum);

	}

}

