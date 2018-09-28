package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int f;
	 int g;
	 int h;
	 int i;
	 int m;
	 int n;
	 for (a = 1;a <= 5;a++)
	 {
	   for (b = 1;b <= 5;b++)
	   {
		for (c = 1;c <= 5;c++)
		{
		 for (d = 1;d <= 5;d++)
		 {
		   if ((a + b == c + d) && (a + d) > (b + c) && (a + c) < b)
		   {
			   e = 10 * a;
		   f = 10 * b;
		   g = 10 * c;
		   h = 10 * d;
		   }
		 }
		}
	   }
	 }
	 if (e < f)
	 {
	   i = e;
	   e = f;
	   f = i;
	 }
	 if (e < g)
	 {
	   i = e;
	   e = g;
	   g = i;
	 }
	 if (e < h)
	 {
	   i = e;
	   e = h;
	   h = i;
	 }
	 System.out.printf("l %d\n",e);
	 if (f < g)
	 {
	   m = f;
	   f = g;
	   g = m;
	 }
	 if (f < h)
	 {
	   m = f;
	   f = h;
	   h = m;
	 }
	 System.out.printf("q %d\n",f);
	 if (g < h)
	 {
	   n = g;
	   g = h;
	   h = n;
	 }
	 System.out.printf("z %d\n",g);
	 System.out.printf("s %d\n",h);
	 return 0;
	}
}
