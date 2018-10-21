package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[10000];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		j = n;
		k = 0;

		for (i = 0;i < n;i++)
		{
			a[j] = a[i];
			j++;
		}
		for (j = 2 * n - m;j < 2 * n;j++)
		{

			a[k] = a[j];
			k++;
		}
		for (j = n;j < 2 * n - m;j++)
		{
			a[j - n + m] = a[j];
		}



			System.out.printf("%d",a[0]);
			for (i = 1;i < n;i++)
			{
			System.out.printf(" %d",a[i]);
			}
	}
}

