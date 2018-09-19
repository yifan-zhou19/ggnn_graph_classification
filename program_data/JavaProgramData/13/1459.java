package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int j;
		int k;
		int m = 0;
		int n;
		int b = 0;
		int c = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n;
		for (i = 0;i < n - 1;i++)
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
			a[i] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
				   a[i] = 0;
				   k -= 1;
				   break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0 && c < k)
			{
				System.out.printf("%d ",a[i]);
				c += 1;
			}
		   else
		   {
			if (a[i] != 0 && c == k)
			{
				System.out.printf("%d",a[i]);
			}
		   }
		}
		return 0;
	}

}

