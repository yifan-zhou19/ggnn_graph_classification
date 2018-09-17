package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[25];
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] t = new int[25];
		//int c[25];
		int min_c;
		int max_t = 1;
		for (j = n - 1;j >= 0;j--)
		{
			if (j == n - 1)
			{
				t[j] = 1;
			}
			/*else if (j==n-2)
			{
			     if (a[n-2]>a[n-1])
			         t[j]=t[j+1]+1;
			     else
			         t[j]=1;     
			}*/
			else
			{
				/*for (k=j;k<n-1;k++)
				{
				    if (a[j]>=a[k+1])
				        c[k+1]=a[j]-a[k+1];
				    else
				        c[k+1]=3000;    
				}
				min_c=c[j+1];*/
				max_t = 0;
				for (k = j;k < n - 1;k++)
				{
					if (a[j] >= a[k + 1] != 0 && max_t < t[k + 1])
					{
						max_t = t[k + 1];
					}
				}
				t[j] = max_t + 1;
			}
		}
		max_t = 1;
		for (j = n - 1;j >= 0;j--)
		{
				 if (t[j] > max_t)
				 {
					 max_t = t[j];
				 }
		}
		System.out.printf("%d\n",max_t);
	}
}

