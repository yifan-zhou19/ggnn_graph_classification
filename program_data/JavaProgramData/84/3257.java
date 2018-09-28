package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int I;
		int n;
		int[] a = new int[100];
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (I = 0;I < n;I++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[I] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] > a[j])
				{
					p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
		}
		System.out.printf("%d\n%d\n",a[0],a[1]);
	}
}

