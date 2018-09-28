package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String x = new String(new char[10000]);
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j = 1;
		int k;
		int max;
		int m = 0;
		int n = 10000;
		int min;
		int y;
		int p;
		int q;
		x = new Scanner(System.in).nextLine();
		k = x.length();
		*(x.Substring(k)) = ' ';
		a[0] = -1;
		for (i = 0;i < k + 1;i++)
		{
			if (x.charAt(i) == ' ')
			{
				a[j] = i;
				j = j + 1;
			}
		}
		/*for(y=0;y<j;y++)
			printf("%d ",a[y]);
		printf("\n");*/
		for (i = 0;i < j - 1;i++)
		{
			b[i] = a[i + 1] - a[i];
		}
		/*for(y=0;y<j-1;y++)
			printf("%d ",b[y]);
		printf("\n");*/
		for (i = j - 2;i > -1;i--)
		{
			if (m <= b[i])
			{
				m = b[i];
				max = i;
			}
			if (n >= b[i])
			{
				n = b[i];
				min = i;
			}
		}
		/*printf("%d %d %d %d\n",max,min,m,n);*/
		p = a[max + 1];
		q = a[max];
		/*printf("%d %d\n",p,q);*/
		for (k = q + 1;k < p;k++)
		{
			System.out.printf("%c",x.charAt(k));
		}
		System.out.print("\n");
		p = a[min + 1];
		q = a[min];
		for (k = q + 1;k < p;k++)
		{
			System.out.printf("%c",*(x.Substring(k)));
		}
		System.out.print("\n");
	}

}
