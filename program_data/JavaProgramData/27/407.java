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
		  float delta;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
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
			  delta = b * b - 4 * a * c;
			  if (Math.abs(delta) < 1e-8)
			  {
				  if (Math.abs(b) < 1e-8)
				  {
				  System.out.printf("x1=x2=%.5f\n",-b / (2 * a) + 1e-8);
				  }
				else
				{
				  System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
				}
			  }
			  if (delta > 1e-8F)
			  {
				System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(delta)) / (2 * a) + 1e-8,(-b - Math.sqrt(delta)) / (2 * a) + 1e-8);
			  }
			  if (delta < -1e-8F)
			  {
				if (a > 0F)
				{
					if (Math.abs(b) < 1e-8)
					{
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a) + 1e-8,Math.sqrt(-delta) / (2 * a),-b / (2 * a) + 1e-8,Math.sqrt(-delta) / (2 * a));
					}
				  else
				  {
					  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),Math.sqrt(-delta) / (2 * a),-b / (2 * a),Math.sqrt(-delta) / (2 * a));
				  }
				}
				else
				{
					if (Math.abs(b) < 1e-8)
					{
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a) + 1e-8,-Math.sqrt(-delta) / (2 * a),-b / (2 * a) + 1e-8,-Math.sqrt(-delta) / (2 * a));
					}
				  else
				  {
					  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),-Math.sqrt(-delta) / (2 * a),-b / (2 * a),-Math.sqrt(-delta) / (2 * a));
				  }
				}
			  }
		  }

		  return 0;
	}

}

