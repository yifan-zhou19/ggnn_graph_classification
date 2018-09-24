public class A
{
 public int x1;
 public int y1;
 public int z1;
}

package <missing>;

public class GlobalMembers
{
	public static A[] a = tangible.Arrays.initializeWithDefaultAInstances(10);

	public static double juli(int a,int b,int c,int d,int e,int f)
	{
	 double m;
	 m = (double)(a - d) * (a - d) + (b - e) * (b - e) + (c - f) * (c - f);
	 m = Math.sqrt(m);
	 return m;
	}
	public static int cmp(Object a, Object b)
	{
		 return (((double)a - (double)b > 0)?1:-1);
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int l = 0;
	 int flag;
	 double[] b = new double[50];
	 while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) //??????
	 {
	  k = 0;
	  for (i = 0;i < n;i++) //???
	  {
	   a[i].x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   a[i].y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   a[i].z1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	   for (i = 0;i < n;i++) //???
	   {
		for (j = i + 1;j < n;j++)
		{
		 b[k++] = juli(a[i].x1, a[i].y1, a[i].z1, a[j].x1, a[j].y1, a[j].z1); //???b[i]??
		}
	   }

		qsort(b,n * (n - 1) / 2,(Double.SIZE / Byte.SIZE),cmp); //????
		l = n * (n - 1) / 2 - 1;
		flag = 0;
	   while (l >= 0)
	   {
		 for (i = 0;i < n;i++)
		 {
				   for (j = i + 1;j < n;j++)
				   {
					if (b[l] == juli(a[i].x1, a[i].y1, a[i].z1, a[j].x1, a[j].y1, a[j].z1))
					{
		   //    printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i].x1,a[i].y1,a[i].z1,a[j].x1,a[j].y1,a[j].z1,b[l]);
			   System.out.print("(");
			   System.out.print(a[i].x1);
			   System.out.print(",");
			   System.out.print(a[i].y1);
			   System.out.print(",");
			   System.out.print(a[i].z1);
			   System.out.print(")");
			   System.out.print("-");
			   System.out.print("(");
			   System.out.print(a[j].x1);
			   System.out.print(",");
			   System.out.print(a[j].y1);
			   System.out.print(",");
			   System.out.print(a[j].z1);
			   System.out.print(")");
			   System.out.print("=");
			   System.out.printf("%.2f", b[l]);
			   System.out.printf("%.2f", "\n");
			   l--;
			   if (b[l] == b[l + 1])
			   {
				continue;
			   }
			   else
			   {
				   flag = 1;
				 break;
			   }
					}
				   }
		   if (flag == 1)
		   {
			flag = 0;
			break;
		   }
		 }

	   }

	 }
	 return 0;

	}
}

