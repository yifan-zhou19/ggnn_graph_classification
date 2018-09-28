package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double a;
		  double b;
		  double c;
		  double x;
		  double num1;
		  double num2;
		  double k1;
		  double k2;
		  for (i = 1;i <= n;i++)
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
			x = b * b - 4 * a * c;
			if (x >= 0)
			{
					if (x == 0)
					{
					num1 = num2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					System.out.printf("x1=x2=%.5f\n",num1);
					}
					else
					{
					num1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					num2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					System.out.printf("x1=%.5f;x2=%.5f\n",num1,num2);
					}
			}
			else
			{
			if (b != 0)
			{
					k1 = -b / (2 * a),k2 = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",k1,k2,k1,k2);

			}
			 else
			 {
					k1 = b / (2 * a),k2 = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",k1,k2,k1,k2);

			 }
			}

		  }
	}

}

