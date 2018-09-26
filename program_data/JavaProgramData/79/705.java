package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[300];
	 int c;
	 int p;
	 int i;
	 int j;
	 int k;
	 int n;
	 int m;
	 while (scanf("%d%d", n, m) && n != 0 && m != 0)
	 {
		for (i = 0;i < n;i++)
		{
			a[i] = 1;
		}
		p = 0;
		for (i = 0;i < n;i++)
		{
		   c = 0;
		   for (j = p;c < m;j = (j + 1) % n)
		   {
				 if (a[j] == 1)
				 {
					 c++;
				 }
			  if (c == m)
			  {
				  a[j] = 0;
			   p = (j + 1) % n;
			  }
		   }
			if (i == n - 1)
			{
					p = (p + n - 1) % n;
				 p++;
			}
		}
		  System.out.printf("%d\n",p);
	 }
	}
}
