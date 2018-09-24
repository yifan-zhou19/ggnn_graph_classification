public class dian
{
   public int h;
   public int x;
}

package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
		dian p1;
		dian p2;
		p1 = (dian)elem1;
		p2 = (dian)elem2;
		return p2.h - p1.h;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  dian[] d = tangible.Arrays.initializeWithDefaultdianInstances((n));
		  int[] a = new int[(n)];
		  for (i = 0;i < n;i++)
		  {
		  a[i] = 1;
		  }
		  for (i = 0;i < n;i++)
		  {
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								d[i].h = Integer.parseInt(tempVar2);
							}
							d[i].x = i;
		  }
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		  qsort(d,n,sizeof(dian),Compare);
		  for (i = n - 2;i >= 0;i--)
		  {
				  for (j = i + 1;j < n;j++)
				  {
							   if (d[i].h == d[j].h && d[i].x > d[j].x)
							   {
																dian c = new dian();
																c.x = d[i].x;
																d[i].x = d[j].x;
																d[j].x = c.x;
							   }
				  }
		  }
		  for (i = n - 2;i >= 0;i--)
		  {
				  for (j = i + 1;j < n;j++)
				  {
							   if (d[i].x < d[j].x)
							   {
										if (a[i] < a[j] + 1)
										{
										   a[i] = a[j] + 1;
										}
							   }
				  }
		  }
		  int max = a[0];
		  for (k = 0;k < n;k++)
		  {
							if (a[k] > max)
							{
							max = a[k];
							}
		  }
		  System.out.printf("%d",max);
		  d = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(a);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

