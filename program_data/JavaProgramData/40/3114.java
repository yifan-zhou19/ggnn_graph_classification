package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  float a;
		  float b;
		  float c;
		  float d;
		  float s;
		  float angle;
		  float S;
		  float delta;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Float.parseFloat(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead("\n");
		  if (tempVar2 != null)
		  {
			  b = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead("\n");
		  if (tempVar3 != null)
		  {
			  c = Float.parseFloat(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead("\n");
		  if (tempVar4 != null)
		  {
			  d = Float.parseFloat(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead("\n");
		  if (tempVar5 != null)
		  {
			  angle = Float.parseFloat(tempVar5);
		  }
		  angle /= 2;
		  angle /= 360;
		  angle *= (2 * 3.1415926);
		  s = (a + b + c + d) / 2;
		  delta = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		  if (delta < 0F)
		  {
			   System.out.print("Invalid input");
		  }
		  else
		  {
			   S = Math.sqrt(delta);
			   System.out.printf("%.4f",S);
		  }
	}

}

