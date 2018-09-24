package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[30000];
		int i;
		int j;
		int k;
		int l;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 0;l < n;l++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[l] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
		   for (j = i + 1;j < n;)
		   {
				if (a[i] == a[j])
				{
				  for (k = j;k < n - 1;k++)
				  {
					  a[k] = a[k + 1];
				  }
				  n = n - 1;
				}
				if (a[i] != a[j])
				{
					j++;
				}
		   }
		}
		for (i = 0;i < n;i++)
		{
			if (t != 0)
			{
				System.out.printf("%d",a[i]);
				t = 0;
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}

}

