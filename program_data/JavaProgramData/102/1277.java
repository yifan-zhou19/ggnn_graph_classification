package <missing>;

public class GlobalMembers
{
	public static void sort(tangible.RefObject<Float> p, int n)
	{
	   float temp;
	   for (int i = 0;i < n;i++)
	   {
		  for (int j = n - 1;j > i;j--)
		  {
			   if (*(p.argValue + j) < *(p.argValue + j - 1))
			   {
					 temp = (p.argValue + j);
					 *(p.argValue + j) = *(p.argValue + j - 1);
					 *(p.argValue + j - 1) = temp;
			   }
		  }
	   }
	}
	public static int Main()
	{
	  void sort(float * p,int n);
	  float[] height = new float[40];
	  char[][] gender = new char[40][6];
	  int n;
	  int[] lens = new int[40];
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
				gender[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height[i] = Float.parseFloat(tempVar3);
			}
			lens[i] = String.valueOf(gender[i]).length();
	  }
	  int p = -1;
	  int q = -1;
	  float[] m = new float[40];
	  float[] f = new float[40];
	  for (int j = 0;j < n;j++)
	  {
		   if (lens[j] == 4)
		   {
				 p++;
				 m[p] = height[j];
		   }
		   else
		   {
				  q++;
				  f[q] = height[j];
		   }
	  }
	  float[] p1 = m;
	  float[] p2 = f;
  tangible.RefObject<Float> tempRef_p1 = new tangible.RefObject<Float>(p1);
	  sort(tempRef_p1, p + 1);
	  p1 = tempRef_p1.argValue;
  tangible.RefObject<Float> tempRef_p2 = new tangible.RefObject<Float>(p2);
	  sort(tempRef_p2, q + 1);
	  p2 = tempRef_p2.argValue;
	  for (int k = 0;k <= p;k++)
	  {
		  System.out.printf("%3.2f ",m[k]);
	  }
	  for (int k = q;k >= 0;k--)
	  {
			   System.out.printf("%3.2f",f[k]);
			   if (k > 0)
			   {
				  System.out.print(" ");
			   }
	  }
	}
}

