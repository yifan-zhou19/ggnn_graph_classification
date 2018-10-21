package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					break;
				}
			}
			if (j == i)
			{
				b[k] = a[i];
				k++;

			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d",b[i]);
			if (i < k - 1)
			{
				System.out.print(",");
			}
		}

	}
}

