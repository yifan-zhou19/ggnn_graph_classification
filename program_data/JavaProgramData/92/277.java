package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static void sifta(int i,int num)
	{
		int j = i * 2;
		int tmp = a[i];
		while (j <= num)
		{
			if (j < num && a[j] < a[j + 1])
			{
				j++;
			}
			if (tmp < a[j])
			{
				a[i] = a[j];
				i = j;
				j = j * 2;
			}
			else
			{
				break;
			}
		}
		a[i] = tmp;
	}
	public static void siftb(int i,int num)
	{
		int j = i * 2;
		int tmp = b[i];
		while (j <= num)
		{
			if (j < num && b[j] < b[j + 1])
			{
				j++;
			}
			if (tmp < b[j])
			{
				b[i] = b[j];
				i = j;
				j = j * 2;
			}
			else
			{
				break;
			}
		}
		b[i] = tmp;
	}
	public static void hsa()
	{
		int i;
		int tmp;
		for (i = n / 2;i > 0;i--)
		{
			sifta(i, n);
		}
		for (i = n;i > 0;i--)
		{
			tmp = a[i];
			a[i] = a[1];
			a[1] = tmp;
			sifta(1, i - 1);
		}
		//for(i=1;i<=n;i++)	printf("%d ",a[i]);
	}
	public static void hsb()
	{
		int i;
		int tmp;
		for (i = n / 2;i > 0;i--)
		{
			siftb(i, n);
		}
		for (i = n;i > 0;i--)
		{
			tmp = b[i];
			b[i] = b[1];
			b[1] = tmp;
			siftb(1, i - 1);
		}
		//for(i=1;i<=n;i++)	printf("%d ",b[i]);
	}
	public static int Main()
	{
		int i;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			hsa();
			hsb(); //find the minest one >= it

			int tot = 0;
			int j = 0;
			int t = 0;
			int[] visited = new int[1001];

			int ha = 1;
			int ta = n;
			int hb = 1;
			int tb = n;
			while (ha <= ta)
			{
				if (a[ha] < b[hb])
				{
					tot += 200;
					ha++;
					hb++;
				}
				else if (a[ta] < b[tb])
				{
					tot += 200;
					ta--;
					tb--;
				}
				else
				{
					if (a[ta] > b[hb])
					{
						tot -= 200; //lose
					}
					//draw
					ta--;
					hb++;
				}
			}
			/*
			for(i=1;i<=n;i++){
				//j++;if(j>n){t--;break;}
				t=i;
				while(b[j]<a[i] && j<n)j++;			
				if(b[j]>a[i])	
				{
					tot+=200;visited[j]=1;j++;
					printf("%d wins %d\n",b[j],a[i]);
				}
				else if(b[j]<a[i]) {tot-=200;visited[j]=1;break;}
				else {visited[j]=1;break;}
			}
			j=1;
			for(i=t+1;i<=n;i++){
				while(j<=n && (visited[j] || a[i]>b[j]))j++;
				if(a[i]!=b[j]){tot-=200;break;}
				else {visited[j]=1;j++;t++;if(j>n)break;}
			}
			*/
			System.out.printf("%d\n",tot);
		}
		//getchar();getchar();
		return 0;
	}

}

