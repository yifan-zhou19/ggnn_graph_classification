package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[501];
		int[] b = new int[501];
		int n;
		int i;
		int j = 0;
		int m;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		if (a[0] % 2 != 0)
		{
			b[j] = a[0];
			j = 1;
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		m = j;
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (b[i] > b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
		}
	}

}

