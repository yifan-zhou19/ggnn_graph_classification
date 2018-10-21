package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[300];
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
		System.out.print("\n");

		for (i = 0;i < n;i++)
		{

		 for (j = 1;j < n - i;j++)
		 {

			if (a[i] == a[i + j])
			{

				for (k = i + j;k < n - 1;k++)
				{

				 a[k] = a[k + 1];
				}

				 j = j - 1;
					n = n - 1;

			}
		 }
		}
			for (i = 0;i < n - 1;i++)
			{
			System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[n - 1]);
	}
}

