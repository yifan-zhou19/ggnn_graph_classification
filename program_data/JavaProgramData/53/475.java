package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int l;
		int m;
		int k;
		int n;
		int s;
		int[] b = new int[100];
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
		b[1] = a[1];
		j = 1;
		k = 1;
		for (i = 1;i <= n;i++)
		{
			k = 1;
			while (k <= j)
			{
				if (b[k] == a[i])
				{
					break;
				}
				else
				{
					k++;
				}
			}
			if (k == j + 1)
			{
				j = j + 1;
				b[j] = a[i];
			}
		}
		for (i = 1;i <= j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != j)
			{
				System.out.print(",");
			}
		}
	}
}

