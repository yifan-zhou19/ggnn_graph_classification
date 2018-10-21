package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float a;
	float b;
	float c;
	float n;
	float i;
	float j;
	float x;
	float y;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Float.parseFloat(tempVar);
	  }
	   for (i = 1F;i <= n;i = i + 1)
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
		  j = b * b - 4 * a * c;
		  if (j > 0F)
		  {
			  System.out.printf("x1=%.5f;x2=%.5f\n",((-b + Math.sqrt(j)) / (2 * a)) + 0.000001,(-b - Math.sqrt(j)) / (2 * a)) + 0;
		  }
		  else
		  {
				if (j == 0F)
				{
					System.out.printf("x1=x2=%.5f\n",(-b) / (2 * a)) + 0;
				}
				else
				{
					   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (2 * a) + 0,Math.sqrt(-j) / 2 / a + 0,(-b) / (2 * a) + 0,Math.sqrt(-j) / 2 / a) + 0;
				}
		  }
	   }
	}

}

