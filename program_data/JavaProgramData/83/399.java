package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][2];
		float[] b = new float[10];
		int n;
		int i;
		int q;
		float p;
		float GPA;
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
			  a[i - 1][0] = Integer.parseInt(tempVar2);
		  }
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i - 1][1] = Integer.parseInt(tempVar3);
		  }
		}
		for (i = 1;i <= n;i++)
		{
		  if (a[i - 1][1] < 60)
		  {
			b[i - 1] = 0F;
		  }
		  if (a[i - 1][1] >= 60 && a[i - 1][1] <= 63)
		  {
			b[i - 1] = 1.0F;
		  }
		  if (a[i - 1][1] >= 64 && a[i - 1][1] <= 67)
		  {
			b[i - 1] = 1.5F;
		  }
		  if (a[i - 1][1] >= 68 && a[i - 1][1] <= 71)
		  {
			b[i - 1] = 2.0F;
		  }
		  if (a[i - 1][1] >= 72 && a[i - 1][1] <= 74)
		  {
			b[i - 1] = 2.3F;
		  }
		  if (a[i - 1][1] >= 75 && a[i - 1][1] <= 77)
		  {
			b[i - 1] = 2.7F;
		  }
		  if (a[i - 1][1] >= 78 && a[i - 1][1] <= 81)
		  {
			b[i - 1] = 3.0F;
		  }
		  if (a[i - 1][1] >= 82 && a[i - 1][1] <= 84)
		  {
			b[i - 1] = 3.3F;
		  }
		  if (a[i - 1][1] >= 85 && a[i - 1][1] <= 89)
		  {
			b[i - 1] = 3.7F;
		  }
		  if (a[i - 1][1] >= 90)
		  {
			b[i - 1] = 4.0F;
		  }
		}
		p = 0F;
		q = 0;
		for (i = 1;i <= n;i++)
		{
		   p = p + a[i - 1][0] * b[i - 1];
		   q = q + a[i - 1][0];
		}
		GPA = p / q;
		System.out.printf("%.2f",GPA);
	}
}

