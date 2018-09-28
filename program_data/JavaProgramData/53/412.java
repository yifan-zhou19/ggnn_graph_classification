package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int[] a = new int[300];
	int i;
	int j;
	int k;
	int m;
	int[] b = new int[300];
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
		b[i] = 1;
	}

	for (i = 0;i < n;i++)
	{
		   for (j = 0;j < i;j++)
		   {
		if (a[i] == a[j])
		{
			b[i] = 0;
		}
		   }
	}

	for (k = n - 1;k >= 0;k--)
	{
			if (b[k] != 0)
			{
			   t = k;
			break;
			}
		else
		{
			continue;
		}


	}
	for (m = 0;m < t;m++)
	{
		 if (b[m] != 0)
		 {
	  System.out.printf("%d,",a[m]);
		 }
	}
	 System.out.printf("%d",a[t]);
	}
}

