package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < i;j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
			}
			if (j == i)
			{
				k++;
				b[k] = a[i];
			}
		}
		for (i = 0;i < k + 1;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != k)
			{
				System.out.print(",");
			}
		}
	}
}

