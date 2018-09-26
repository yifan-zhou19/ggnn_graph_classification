package <missing>;

public class GlobalMembers
{
	public static void Qsort(int[] a, int low, int up)
	{
		int i;
		int j;
		int k;
		int x;
		if (low >= up)
		{
			return;
		}
		else
		{
			k = a[low];
			j = low;
			for (i = low;i <= up;i++)
			{
				if (a[i] > k)
				{
					j++;
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
			x = k;
			a[low] = a[j];
			a[j] = x;
			Qsort(a, low, j - 1);
			Qsort(a, j + 1, up);

		}
	}
	/*int main()
	{
	    int n,i,j,w,l;
	    int a[1000],b[1000];
	    scanf("%d",&n);
	    while(n!=0){
	    for(i=0;i<n;i++)
	            a[i]=b[i]=0;
	    for (i=0;i<n;i++)
	        scanf("%d",&a[i]);
	    for (i=0;i<n;i++)
	        scanf("%d",&b[i]);
	    Qsort(a,0,n-1);
	    Qsort(b,0,n-1);
	    w=l=0;
	        j=0;
	    for(i=0;i<n;i++)
	    {
	        while (a[i]<b[j])j++;
	        if (j>=n) {l++;continue;}
	        else
	        {
	            if (a[i]>b[j]) w++;
	            j++;
	        }
	    }
	    printf("%d\n",w*200-200*l);
	    scanf("%d",&n);
	    }
	}*/
	public static int Main()
	{
		int[] know = new int[10000];
		int[] beknown = new int[10000];
		int n = 0;
		int i;
		int x;
		int y;
		int flag;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = y = 1;
		t = 0;
		while (x + y != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			know[x]++;
			beknown[y]++;
		}
		flag = 0;
		for (i = 0;i < n;i++)
		{
			if ((know[i] == 0) && (beknown[i] == n - 1))
			{
				flag = 1;
				t = i;
			}
		}
		if (flag == 1)
		{
			System.out.printf("%d",t);
		}
		else
		{
			System.out.print("NOT FOUND");
		}

	}
}

