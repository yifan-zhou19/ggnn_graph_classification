package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  double a;
	  double b;
	  double c;
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
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Double.parseDouble(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  c = Double.parseDouble(tempVar4);
		  }
	  if (b * b - 4 * a * c >= 0.00001)
	  {
	  System.out.printf("x1=%.5f;x2=%.5f",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	  }
	  else if (b * b - 4 * a * c <= -0.00001 && b != 0)
	  {
	  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",-b / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a),-b / (2 * a),Math.sqrt(4 * a * c - b * b) / (2 * a));
	  }
	  else if (b * b - 4 * a * c <= -0.00001 && b == 0)
	  {
	  System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi",Math.sqrt(4 * a * c) / (2 * a),Math.sqrt(4 * a * c) / (2 * a));
	  }
	  else
	  {
		  System.out.printf("x1=x2=%.5f",-b / (2 * a));
	  }
	  if (i != n)
	  {
		  System.out.print("\n");
	  }
	  }
	}

}

