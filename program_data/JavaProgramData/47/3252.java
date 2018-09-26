package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[MAX];
		int i;
		int j;
		int n;
		int t;
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
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",a[i]);
			}
		   else
		   {
			   System.out.printf("%d ",a[i]);
		   }
		}
		return 0;
	}

}

