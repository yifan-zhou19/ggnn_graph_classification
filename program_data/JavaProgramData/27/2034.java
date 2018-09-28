package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double a;
		  double b;
		  double c;
		  int i = 1;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  d = Integer.parseInt(tempVar);
		  }
		  for (i;i <= d;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			if (b * b - 4 * a * c > 0)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",(0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(0 - b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			}
			if (b * b - 4 * a * c == 0)
			{
				System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
			}
			if (b * b - 4 * a * c < 0)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",0 - b / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a),0 - b / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a));
			}
		  }
	}

}

