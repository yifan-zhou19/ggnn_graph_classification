package <missing>;

public class GlobalMembers
{
	/*int fun(int h[],int p[],int x,int y)
	{
		int f;
		if(x*y==0)
			f=0;
		else
		{
		if(h[x]==p[y])
			f=fun(h,p,x-1,y-1)+1;
		else
			if(fun(h,p,x-1,y)>fun(h,p,x,y-1))
				f=fun(h,p,x-1,y);
			else
				f=fun(h,p,x,y-1);
		}
		return(f);
	}
	*/
	public static void Main()
	{
		int k;
		int[] h = new int[26];
		int[] p = new int[26];
		int i;
		int j;
		int m;
		int t;
		int[][] a = new int[26][26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= k;i++)
		{
			p[i] = h[i];
		}
		for (i = 1;i < k;i++)
		{
			m = i;
			for (j = i + 1;j <= k;j++)
			{
				if (p[j] > p[m])
				{
					m = j;
				}
			}
			t = p[i];
			p[i] = p[m];
			p[m] = t;
		}
		/*for(i=1;i<=k;i++) printf("%d ",h[i]);
		printf("\n");
		for(i=1;i<=k;i++) printf("%d ",p[i]);*/
		for (i = 0;i <= k;i++)
		{
			for (j = 0;j <= k;j++)
			{
				a[i][j] = 0;
			}
		}
		/*for(i=0;i<k;i++)
		{
			for(j=0;j<k;j++)
				printf("%d ",a[i][j]);
			printf("\n");
		}*/
		for (i = 1;i <= k;i++)
		{
			for (j = 1;j <= k;j++)
			{
				if (h[i] == p[j])
				{
					a[i][j] = a[i - 1][j - 1] + 1;
				}
				else
				{
					if (a[i - 1][j] > a[i][j - 1])
					{
						a[i][j] = a[i - 1][j];
					}
				else
				{
					a[i][j] = a[i][j - 1];
				}
				}
			}
		}
		/*for(i=0;i<=k;i++)
		{
			printf("\n");
			for(j=0;j<=k;j++)
				printf("%d ",a[i][j]);
			
		}*/
		System.out.printf("%d",a[k][k]);
	}

}

