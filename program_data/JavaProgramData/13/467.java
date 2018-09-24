package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int flag;
		int[] a = new int[20000];
		int[] b = new int[20000];
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
		for (i = 0;i < n;i++)
		{
			flag = 1;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
			flag = 0;
				}
			}
			if (flag == 1)
			{
				b[k] = a[i];
			k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[i]);
	}


}

