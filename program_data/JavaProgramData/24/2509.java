package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[N]);
		c = new Scanner(System.in).nextLine();
		int[] a = new int[N];
		int[] b = new int[N];
		int i;
		int j = 0;
		int y = 0;
		int n = 0;
		int m = 0;
		int l = 0;
		int q = 0;
		int e = 0;
		int f = 0;
		int w = 0;
		int len;
		int[] d = new int[N];
		len = c.length();
		for (i = 0;i <= len;i++)
		{
			if (c.charAt(i) == ' ' || c.charAt(i) == '\0')
			{
				n = i - d[j];
				b[j] = n; //??????
				y = y + n + 1;
				d[j + 1] = y - 1; //??????????????
				m = m++; //m???
				j = j++;
			}
		}
		b[1] = b[1] - 1;
		b[m] = len - d[m];
		d[1] = d[1] + 1;
		//printf("%d\n",m);
		/*for(i=0;i<m;i++)
		{
			printf("%d\n",b[i]);
		}*/
	  for (j = 0;j < m + 1;j++)
	  {
		   l = 0;
		   for (i = 0;i < m;i++)
		   {
			   if (b[i] <= b[j])
			   {
				   l = l++;
			   }
		   }
		   if (l >= m)
		   {
			   e = j;
			   break;
		   }
	  }
	   for (j = 0;j < m;j++)
	   {
		   q = 0;
		   for (i = 0;i < m;i++)
		   {
			   if (b[i] >= b[j])
			   {
				   q = q++;
			   }
		   }
		   if (q >= m)
		   {
			   f = j;
			   break;
		   }
	   }
	//printf("%d %d %d %d\n",e,f,d[e],d[f]);
			for (i = d[e];i < d[e] + b[e];i++)
			{
		   System.out.printf("%c",c.charAt(i));
			}
	   System.out.print("\n");
	   /*if(d[f]==0)
	   {
	        for(i=d[f];i<d[f]+b[f];i++)
			{
		   printf("%c",c[i]);
			}
	   }
	   else
	   {*/
		   for (i = d[f];i < d[f] + b[f];i++)
		   {
		   System.out.printf("%c",c.charAt(i));
		   }
	  // }
	   System.out.print("\n");
	   return 0;
	}
}
