package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int i;
		int j;
		int n;
		int[] a = new int[20000];
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
			for (i = 0;i < n;i++) //????
			{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i]) //????????????????0?????
				{
				a[j] = 0;
				}
			}
			}
		for (j = n - 1;a[j] == 0;j--)
		{
			k = 0; //????????????,?????????0?????
		}
		for (i = 0;i < j;i++)
		{
		if (a[i] != 0)
		{
		System.out.printf("%d ",a[i]);
		}
		}
		System.out.printf("%d",a[j]);
		return 0;
	}
}

