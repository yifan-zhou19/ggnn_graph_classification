package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int[] r = new int[6];
		int[] p = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				r[i] = Integer.parseInt(tempVar);
			}
		p[i] = reverse(r[i]);
		}
		for (i = 0;i < 6;i++)
		{
		System.out.printf("%d\n",p[i]);
		}
	}
	public static int reverse(int num)
	{
		int i = 0;
		int t;
		int j;
		int k;
		int m;
		int c = 0;
		int[] a = new int[1000];
		int q;
		q = Math.abs(num); //?????????????
		i = Math.log10(q);
		for (t = i,j = 0;t >= 0;t--,j++)
		{
			a[j] = q / Math.pow(10,t);
		q = q - a[j] * Math.pow(10,t);
		}
			for (k = 0,c = 0;k < j;k++)
			{
			c = c + a[k] * Math.pow(10,k);
			}
			if (num >= 0)
			{
				return (c);
			}
			else
			{
				return (-c);
			}


	}


}

