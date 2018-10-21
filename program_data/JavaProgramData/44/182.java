package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
		int d = 0;
		while (m != 0)
		{
		d = d * 10 + m % 10;
		m = m / 10;
		}
		return d;
	}
	public static int Main()
	{
		  int[] a = new int[7];
		  int[] b = new int[7];
		  int[] c = new int[7];
		  int i = 1;
		  int m;
		  for (;i <= 6;i++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  if (a[i] >= 0)
		  {
		  m = a[i];
		  c[i] = f(m);

		  }
		  else
		  {
		  m = -a[i];
		  b[i] = f(m);
		  c[i] = -b[i];
		  }
		  }
		  for (i = 1;i <= 6;i++)
		  {
		  System.out.printf("%d\n",c[i]);
		  }
				return 0;
	}


}

