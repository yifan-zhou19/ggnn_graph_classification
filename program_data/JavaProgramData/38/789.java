package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int i;
	  int j;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < n;j++)
	  {
	  float a;
	  float b;
	  a = 0F;
	  int m;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  float[] szj = new float[m];
	  for (i = 0;i < m;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			szj[i] = Float.parseFloat(tempVar3);
		}
		a += szj[i];
	  }
	  b = (float)a / m;
	  double c;
	  double d;
	  double e;
	  c = 0;
	  for (i = 0;i < m;i++)
	  {
		c += (double)(szj[i] - b) * (szj[i] - b);
	  }
		d = (double)c / m;
		e = Math.sqrt(d);
		System.out.printf("%.5lf\n",e);
	  }
	return 0;
	 }

}

