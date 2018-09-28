package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 float a;
	 float b;
	 float c;
	 float r;
	 float s;
	 float x1;
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
	   r = (b * b - 4 * a * c);
	   s = -(b) / (2 * a);
	   if (Math.abs(s) < 0.00001)
	   {
		   s = 0F;
	   }
	   x1 = (-b + Math.sqrt(r)) / (2 * a);
	   if (Math.abs(x1) < 0.00001)
	   {
		   x1 = 0F;
	   }
	   if (r > 0.00001F)
	   {
		   System.out.printf("x1=%.5f;x2=%.5f",x1,(-b - Math.sqrt(r)) / (2 * a));
	   }
		else if (Math.abs(r) < 0.00001)
		{
			System.out.printf("x1=x2=%.5f",s);
		}
			  else if (a > 0F)
			  {
				  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",s,(Math.sqrt(-r)) / (2 * a),s,(Math.sqrt(-r)) / (2 * a));
			  }
			  else
			  {
				  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",s,-(Math.sqrt(-r)) / (2 * a),s,-(Math.sqrt(-r)) / (2 * a));
			  }
	   System.out.print("\n");
	 }
	}
}

