package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double delta;
	double root;
	int n;
	int i;

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
	   delta = b * b - 4 * a * c;
	   if (delta < 0)
	   {
			delta = -delta;
			root = (-b) / (2 * a);
			if (root == 0)
			{
				root = -root;
			}
			System.out.printf("x1=%.5f",root);
			System.out.print("+");
			System.out.printf("%.5f",Math.sqrt(delta) / (2 * a));
			System.out.print("i");
			System.out.print(";");
			System.out.printf("x2=%.5f",root);
			System.out.print("-");
			System.out.printf("%.5f",Math.sqrt(delta) / (2 * a));
			System.out.print("i");
			System.out.print("\n");
	   }
	   else
	   {
		  x1 = (-b + Math.sqrt(delta)) / (2 * a);
		  x2 = (-b - Math.sqrt(delta)) / (2 * a);
		  if (x1 == x2)
		  {
			System.out.printf("x1=x2=%.5f",x1);
			System.out.print("\n");
		  }
		  else
		  {
			System.out.printf("x1=%.5f",x1);
			System.out.print(";");
			System.out.printf("x2=%.5f",x2);
			System.out.print("\n");
		  }

	   }


	}


	return 0;
	}
}

