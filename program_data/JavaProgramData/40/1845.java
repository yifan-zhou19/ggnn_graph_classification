package <missing>;

public class GlobalMembers
{
		public static void Main()
		{
			float a;
			float b;
			float c;
			float d;
			float e;
			float S = new float(float f,float g,float h,float i,float j);
			float z;
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
			z = S(a, b, c, d, e);
			if (z > 0F)
			{
			System.out.printf("%.4f",z);
			}
			else
			{
				 System.out.print("Invalid input");
			}
		}
		public static float S(float f,float g,float h,float i,float j)
		{
			double sq;
			double s;
			s = (f + g + h + i) / 2;
			if (((s - f) * (s - g) * (s - h) * (s - i) - f * g * h * i * Math.cos(j / 720 * 2 * PI) * Math.cos(j / 720 * 2 * PI)) > 0)
			{


			sq = Math.sqrt((s - f) * (s - g) * (s - h) * (s - i) - f * g * h * i * Math.cos(j / 720 * 2 * PI) * Math.cos(j / 720 * 2 * PI));
			}
			return (sq);
		}
}

