package <missing>;

public class GlobalMembers
{
	public static int pfCb(Object x, Object y)
	{
		return *((int)x) - (int)y;
	}

	public static int pfCg(Object x, Object y)
	{
		return *((int)y) - (int)x;
	}

	public static int Main()
	{
		  int n;
		  int j = 0;
		  int k = 0;
		  String gender = new String(new char[7]);
		  float[] m = new float[40];
		  float[] f = new float[40];
		  float height;
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
					  gender = tempVar2.charAt(0);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  height = Float.parseFloat(tempVar3);
				  }
				  if (gender.charAt(0) == 'm')
				  {
					  m[j] = height;
					  j++;
				  }
				  else
				  {
					  f[k] = height;
					  k++;
				  }
		  }
		  qsort(m,j,(Float.SIZE / Byte.SIZE),pfCb);
		  qsort(f,k,(Float.SIZE / Byte.SIZE),pfCg);
		  System.out.printf("%.2f",m[0]);
		  for (int t = 1;t < j;t++)
		  {
				  System.out.printf(" %.2f",m[t]);
		  }
		  for (int t = 0;t < k;t++)
		  {
				  System.out.printf(" %.2f",f[t]);
		  }
	}

}

