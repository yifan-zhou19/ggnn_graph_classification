package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int k;
		int j;
		int m;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (j = 0,i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				a[j] = a[i];
				j++;
			}
		}
		for (m = 0;m < j - 1;m++)
		{
			System.out.printf("%d ",a[m]);
		}
		System.out.printf("%d",a[j - 1]);
	}

}

