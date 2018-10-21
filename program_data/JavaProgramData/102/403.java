public class ren
{
	 public String a = new String(new char[10]);
	 public float b;
}

package <missing>;

public class GlobalMembers
{
	public static void l(float[] a, int n)
	{
		 float k;
		 for (int i = 0;i < n;i++)
		 {
		 for (int j = i;j < n;j++)
		 {
			  if (a[j] < a[i])
			  {
				   k = a[i];
				   a[i] = a[j];
				   a[j] = k;
			  }
		 }
		 }
	}
	public static int Main()
	{
		 void l(float * a,int n);
		 int n;
		 int p = 0;
		 int q = 0;
		 ren[] m = tangible.Arrays.initializeWithDefaultrenInstances(40);
		 float[] f = new float[40];
		 float[] g = new float[40];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 0;i < n;i++)
		 {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m[i].a = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  m[i].b = Float.parseFloat(tempVar3);
			  }
			  if (strcmp(m[i].a,"male") == 0)
			  {
				   f[p] = m[i].b;
				   p++;
			  }
			  else
			  {
				   g[q] = m[i].b;
				   q++;
			  }
		 }
		 l(g, q);
		 l(f, p);
		 for (int i = 0;i < p;i++)
		 {
				 System.out.printf("%.2f",f[i]);
				 System.out.print(" ");
		 }
		 for (int i = q - 1;i >= 0;i--)
		 {
			  System.out.printf("%.2f",g[i]);
			  if (i != 0)
			  {
				  System.out.print(" ");
			  }
		 }
	}

}

