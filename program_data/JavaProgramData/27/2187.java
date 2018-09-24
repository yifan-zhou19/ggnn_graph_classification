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
		float m;
		float x1;
		float x2;
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
			  m = b * b - 4 * a * c;
			  if (m == 0F)
			  {
				  System.out.printf("x1=x2=%.5f\n",(-b) / (2 * a));
			  }
			  else if (m > 0F)
			  { //x1=((-b) + sqrt(b*b-4*a*c))/(2*a);
			   //x2 = ((-b) - sqrt(b*b-4*a*c))/(2*a);
			   //printf("x1=%.5f;x2=%.5f\n",x1,x2);
			   System.out.printf("x1=%.5f;x2=%.5f\n",((-b) + Math.sqrt(b * b - 4 * a * c)) / (2 * a),((-b) - Math.sqrt(b * b - 4 * a * c)) / (2 * a));

			  }
			  else
			  {
			   if (b == 0F)
			   {
				   System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",Math.sqrt(-m) / (2 * a),Math.sqrt(-m) / (2 * a));
			   }
			   else
			   {
				   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),Math.sqrt(-m) / (2 * a),-b / (2 * a),Math.sqrt(-m) / (2 * a));
			   }
			  }
		}
	}
}

