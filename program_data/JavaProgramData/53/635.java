package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		int[] p = b;
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
		}
		b[k++] = a[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
			if (a[i] == b[j])
			{
		break;
			}
		else if (j == (k - 1))
		{
				b[k++] = a[i];
		}
			}
		}
		for (j = 0;j < (k - 1);j++)
		{
			System.out.printf("%d,",p[j]);
		}
		System.out.printf("%d",p[k - 1]);
	}


}

