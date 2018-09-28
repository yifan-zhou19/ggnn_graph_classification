package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float e;
		float s;
		float t;
		float h;
		float g;
		float k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Float.parseFloat(tempVar5);
		}
			 s = (a + b + c + d) / 2;
			  h = (s - a) * (s - b) * (s - c) * (s - d);
			  t = a * b * c * d;
			  g = Math.cos(3.1415926 * e / 360) * Math.cos(3.1415926 * e / 360);
			  k = h - t * g;
			  if (k > 0F)
			  {
				  System.out.printf("%.4f\n",Math.sqrt(k));
			  }
			  else
			  {
				  System.out.print("Invalid input");
			  }
			  return 0;
	}



}

