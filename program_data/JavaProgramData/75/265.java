package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[5000]);
		c = new Scanner(System.in).nextLine();
		int[] x = new int[5000];
		int[] y = new int[5000];
		int n = 0;
		int i = 0;
		int j = 0;
		int[] a = new int[5000];
		for (i = 0;i < 5000;i++)
		{
			x[i] = 0;
			y[i] = 0;
			a[i] = 0;
		}
		i = 0;
		while (c.charAt(i) != 0)
		{
			if (c.charAt(i) != ',')
			{
				x[n] = x[n] * 10 + c.charAt(i) - '0';
			}
			else
			{
				n++;
			}
			i++;
		}
		c = new Scanner(System.in).nextLine();
		n = 0;
		i = 0;
		while (c.charAt(i) != 0)
		{
			if (c.charAt(i) != ',')
			{
				y[n] = y[n] * 10 + c.charAt(i) - '0';
			}
			else
			{
				n++;
			}
			i++;
		}
	/*	printf("%d\n",n);
		for(i=0;i<=n;i++)
			printf("%d,%d ",x[i],y[i]);	*/
			//????,n+1????
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j <= n;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
						a[i]++;
				}
			}
		}
		int m = 0;
		for (i = 0;i <= 1000;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}
		System.out.printf("%d %d",n + 1,m);
	//	for(i=0;i<=1000;i++)
	//		printf(" %d  ",a[i]);
	}
	/*	puts(c);
		for(i=0;i<=n;i++)
			printf("%d,",a[i]);
			for(i=0;i<=n;i++)
				if(a[i]>k)
				{
					k=a[i];
				}
			for(i=0;i<=n;i++)
				if(a[i]==k)
					a[i]=0;
			k=0;
			for(i=0;i<=n;i++)
				if(a[i]!=0)
					break;
			if(i>n)printf("No");
			else
			{
			for(i=0;i<=n;i++)
			{
				if(a[i]>k)
					k=a[i];
			}
			printf("%d",k);
			}
	}
	*/
}
