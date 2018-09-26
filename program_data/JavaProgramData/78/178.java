public class per
{
	   public char c;
	   public int w;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(per[] a, int n)
	{
		 int i;
		 int m;
		 int j;
		 per temp = new per();
		 for (i = 0;i < n;i++)
		 {
			  m = i;
			  for (j = i + 1;j < n;j++)
			  {
					if (a[j].w > a[m].w)
					{
						  m = j;
					}
			  }
			  if (m != i)
			  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[i];
					temp.copyFrom(a[i]);
					a[i] = a[m];
					a[m] = temp;
			  }
		 }
	}
	public static int Main()
	{
		  int flag = 0;
		  int i;
		  per[] p = tangible.Arrays.initializeWithDefaultperInstances(4);
		  p[0].c = 'z';
		  p[1].c = 'q';
		  p[2].c = 's';
		  p[3].c = 'l';
		  for (p[0].w = 10;p[0].w <= 50;p[0].w += 10)
		  {
			   for (p[1].w = 10;p[1].w <= 50;p[1].w += 10)
			   {
					 for (p[2].w = 10;p[2].w <= 50;p[2].w += 10)
					 {
						   for (p[3].w = 10;p[3].w <= 50;p[3].w += 10)
						   {
								 if ((p[0].w + p[1].w == p[2].w + p[3].w) && (p[0].w + p[3].w > p[2].w + p[1].w) && (p[0].w + p[2].w < p[1].w))
								 {
									   flag = 1;
									   break;
								 }
						   }
						   if (flag == 1)
						   {
								 break;
						   }
					 }
					 if (flag == 1)
					 {
						   break;
					 }
			   }
			   if (flag == 1)
			   {
					 break;
			   }
		  }
		  sort(p, 4);
		  for (i = 0;i < 4;i++)
		  {
			   System.out.printf("%c %d\n",p[i].c,p[i].w);
		  }

	}

}

