package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  float a;
		  float b;
		  float c;
		  double x;
		  double y;
		  double z;
		  double x1;
		  double x2;
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
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			if (Math.abs(b * b - 4 * a * c) < 1e-6)
			{
				  x1 = -b / (2 * a),x2 = -b / (2 * a);
				  System.out.printf("x1=x2=%.5f\n",x1);
			}
			else if (b * b - 4 * a * c > 1e-6F)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else
			{
				x = -b / (2 * a),y = Math.sqrt(4 * a * c - b * b) / (2 * a);
				if (Math.abs(x) < 1e-6)
				{
					x = -x;
				}
				System.out.printf("x1=%0.5f+%0.5fi;x2=%0.5f-%0.5fi\n",x,y,x,y);
			}
		  }
	}
}

