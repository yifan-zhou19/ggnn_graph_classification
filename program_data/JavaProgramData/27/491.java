package <missing>;

public class GlobalMembers
{
	public static void jie(float a,float b,float c)
	{
		 float p;
		 float disc;
		 float q;
		 float x1;
		 float x2;
		 if (b / (2 * a) != 0)
		 {
		 p = -b / (2 * a);
		 }
		 else
		 {
		 p = b / (2 * a);
		 }
		 disc = b * b - 4 * a * c;
		  if (disc == 0F)
		  {
		  System.out.printf("\nx1=x2=%5.5f\n",p);
		  }
		  else
		  {
		  if (disc >= 0F)
		  {
			  q = Math.sqrt(disc) / (2 * a);
			  x1 = p + q;
			  x2 = p - q;
			System.out.printf("\nx1=%5.5f;x2=%5.5f\n",x1,x2);
		  }
		  else
		  {
			  q = Math.sqrt(-disc) / (2 * a);
		  System.out.printf("\nx1=%5.5f+%5.5fi;x2=%5.5f-%5.5fi\n",p,q,p,q);
		  }
		  }
	}
	public static int Main()
	{
		float[] a;
		float[] b;
		float[] c;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new float[n];
		b = new float[n];
		c = new float[n];
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			c[i] = Float.parseFloat(tempVar4);
		}
		}
		for (i = 1;i <= n;i++)
		{
			 jie(a[i], b[i], c[i]);
		}
		 return 0;
	}

}

