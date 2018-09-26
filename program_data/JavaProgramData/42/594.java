package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int[] a = new int[100000];
		int i;
		int j;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				a[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < (j - 1);i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[j - 1]);
		System.out.print("\n");
	}

}

