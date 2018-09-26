package <missing>;

public class GlobalMembers
{
	public static float sum(int n)
	{
		  float j;
		  float s;
		  int i;
		  float[] a = new float[1000];
		  float[] b = new float[1000];
		  a[1] = 2F;
		  a[2] = 3F;
		  b[1] = 1F;
		  b[2] = 2F;
		  if (n == 1)
		  {
			  j = 2F;
		  return j;
		  }
		  if (n == 2)
		  {
			  j = 3.5F;
		  return j;
		  }
		  if (n != 1 && n != 2)
		  {
			  s = 3.5F;
			  for (i = 3;i <= n;i++)
			  {
				a[i] = a[i - 1] + a[i - 2];
				b[i] = b[i - 1] + b[i - 2];
				s = s + (a[i] / b[i]);
			  }
			  return s;
		  }
	}
	public static int Main()
	{
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (x = 0;x < m;x++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%.3f\n",sum(n));
		}
		System.in.read();
		System.in.read();
	}




}

