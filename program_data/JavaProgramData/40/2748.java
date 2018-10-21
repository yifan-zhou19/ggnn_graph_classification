package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  float a;
	  float b;
	  float c;
	  float d;
	  float e;
	  float s;
	  float t = 0F;
	  float m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Float.parseFloat(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = Float.parseFloat(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   c = Float.parseFloat(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   d = Float.parseFloat(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   e = Float.parseFloat(tempVar5);
	   }
	   s = (a + b + c + d) / 2;
	   m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos((e * 3.1415926) / 360),2);
	   if (m < 0F)
	   {
	   System.out.print("Invalid input");
	   }
	   else
	   {
		   t = Math.sqrt(m);
	  System.out.printf("%.4f",t);
	   }
	}

}

