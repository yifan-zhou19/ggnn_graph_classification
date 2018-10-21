package <missing>;

public class GlobalMembers
{
	 public static float f(int a)
	 {
			if (90 <= a != 0 && a <= 100)
			{
				return 4F;
			}
			if (85 <= a != 0 && a <= 89)
			{
				return 3.7F;
			}
			if (82 <= a != 0 && a <= 84)
			{
				return 3.3F;
			}
			if (78 <= a != 0 && a <= 81)
			{
				return 3.0F;
			}
			if (75 <= a != 0 && a <= 77)
			{
				return 2.7F;
			}
			if (72 <= a != 0 && a <= 74)
			{
				return 2.3F;
			}
			if (68 <= a != 0 && a <= 71)
			{
				return 2.0F;
			}
			if (64 <= a != 0 && a <= 67)
			{
				return 1.5F;
			}
			if (60 <= a != 0 && a <= 63)
			{
				return 1.0F;
			}
			if (a < 60)
			{
				return 0F;
			}
	 }
	 public static int Main()
	 {
		 int n;
		 int i;
		 int m;
		 float h;
		 h = 0F;
		 m = 0;
		 float GPA;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] c = new int[10];
		 int[] b = new int[10];
		 for (i = 0;i < n;i++)
		 {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  c[i] = Integer.parseInt(tempVar2);
			  }
		 }
		  System.out.print("\n");
		  for (i = 0;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }

			for (i = 0;i < n;i++)
			{
				   h += f(b[i]) * c[i];
			  m += c[i];
			}
		   GPA = (float)h / m;
		   System.out.printf("%.2f",GPA);
			return 0;
	 }

}

