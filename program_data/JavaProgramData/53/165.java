package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int[] b = new int[300];
		int i;
		int j;
		int k = 1;
		int t = 1;
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
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			t = 1;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					t = 0;
				}
			}
			if (t != 0)
			{
				b[k] = a[i];
				k++;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		System.out.print("\n");
	}
}

