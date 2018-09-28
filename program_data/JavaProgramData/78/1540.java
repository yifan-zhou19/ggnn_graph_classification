package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //????
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int i;
		int j;
		int t;
		int m;
		char[] b = {'z', 'q', 's', 'l'}; //????
		char k;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
					   if (z + q == s + l && z + l > s + q && z + s < q) //??z+q==s+l?z+l>s+q?z+s<q
					   {
						   a[0] = z,a[1] = q,a[2] = s,a[3] = l; //???a[0]=z,a[1]=q,a[2]=s,a[3]=l
						   for (i = 0;i <= 3;i++)
						   {
							   for (j = 0;j <= 2 - i;j++)
							   {
								   if (a[j] < a[j + 1])
								   {
									   t = a[j];
									   a[j] = a[j + 1];
									   a[j + 1] = t; //??a[j]<a[j+1],??a[j]?a[j+1]??
									k = b[j];
									b[j] = b[j + 1];
									b[j + 1] = k; //????b[j]?b[j+1]
								   }
							   }
						   }
					   }
					}
				}
			}
		}
		for (m = 0;m <= 3;m++)
		{
			System.out.print(b[m]);
			System.out.print(" ");
			System.out.print(10 * a[m]);
			System.out.print("\n");
		}
		return 0;
	}
}
