package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] s1 = new int[10];
		 int[] s2 = new int[10];
		 float[] gpa = new float[10];
		 float k;
		 float sum = 0F;
		 float sum2 = 0F;
		 int i;
		 int n;
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
					 s1[i] = Integer.parseInt(tempVar2);
				 }
				 sum = sum + s1[i];
		 }
		 for (i = 1;i <= n;i++)
		 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 s2[i] = Integer.parseInt(tempVar3);
				 }
				 if (s2[i] >= 90)
				 {
					 gpa[i] = 4.0F;
				 }
				 else if (s2[i] >= 85 && s2[i] <= 89)
				 {
					 gpa[i] = 3.7F;
				 }
				 else if (s2[i] >= 82 && s2[i] <= 84)
				 {
					 gpa[i] = 3.3F;
				 }
				 else if (s2[i] >= 78 && s2[i] <= 81)
				 {
					 gpa[i] = 3.0F;
				 }
				 else if (s2[i] >= 75 && s2[i] <= 77)
				 {
					 gpa[i] = 2.7F;
				 }
				 else if (s2[i] >= 72 && s2[i] <= 74)
				 {
					 gpa[i] = 2.3F;
				 }
				 else if (s2[i] >= 68 && s2[i] <= 71)
				 {
					 gpa[i] = 2.0F;
				 }
				 else if (s2[i] >= 64 && s2[i] <= 67)
				 {
					 gpa[i] = 1.5F;
				 }
				 else if (s2[i] >= 60 && s2[i] <= 63)
				 {
					 gpa[i] = 1.0F;
				 }
				 else
				 {
					 gpa[i] = 0F;
				 }
				 sum2 = sum2 + s1[i] * gpa[i];
		 }
		 k = sum2 / sum;
		 System.out.printf("%.2f",k);
		 return 0;
	}
}

