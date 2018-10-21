package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  void paixu(float * p,int x);
		  float[] h = new float[45];
		  float[] m = new float[45];
		  float[] f = new float[45];
		  char[][] a = new char[45][10];
		  int i;
		  int n;
		  int j1 = 1;
		  int j2 = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  h[i] = Float.parseFloat(tempVar3);
			  }
		  }
		  for (i = 1;i <= n;i++)
		  {
			  if (a[i][0] == 'm')
			  {
				  m[j1] = h[i];
				  j1++;
			  }
			  if (a[i][0] == 'f')
			  {
				  f[j2] = h[i];
				  j2++;
			  }
		  } //tiqu
		  paixu(m, j1 - 1);
		  paixu(f, j2 - 1);
		  for (i = 1;i <= j1 - 1;i++)
		  {
			  System.out.printf("%.2f ",m[i]);
		  }
		  for (i = j2 - 1;i >= 2;i--)
		  {
			  System.out.printf("%.2f ",f[i]);
		  }
		  System.out.printf("%.2f\n",f[1]);
	}

	public static void paixu(float[] p, int x)
	{
		 int k;
		 int mo;
		 float huan;
		 for (mo = x - 1;mo >= 1;mo--)
		 {
			 for (k = 1;k <= mo;k++)
			 {
				  if (p[k] > p[k + 1])
				  {
					  huan = p[k];
					  p[k] = p[k + 1];
					  p[k + 1] = huan;
				  }
			 }
		 }
	}
}

