package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[10];
	int[] b = new int[10];
	int n;
	int i;
	int j;
	int d = 0;
	float[] c = new float[10];
	float e = 0.0F;
	float GPA;
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
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	scanf("\n");
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}

	for (j = 0;j < n;j++)
	{
		  if (b[j] >= 90 && b[j] <= 100)
		  {
			  c[j] = 4.0F;
		  }
	   else if (b[j] >= 85 && b[j] <= 89)
	   {
		   c[j] = 3.7F;
	   }
	   else if (b[j] >= 82 && b[j] <= 84)
	   {
		   c[j] = 3.3F;
	   }
	   else if (b[j] >= 78 && b[j] <= 81)
	   {
		   c[j] = 3.0F;
	   }
	   else if (b[j] >= 75 && b[j] <= 77)
	   {
		   c[j] = 2.7F;
	   }
	   else if (b[j] >= 72 && b[j] <= 74)
	   {
		   c[j] = 2.3F;
	   }
	   else if (b[j] >= 68 && b[j] <= 71)
	   {
		   c[j] = 2.0F;
	   }
	   else if (b[j] >= 64 && b[j] <= 67)
	   {
		   c[j] = 1.5F;
	   }
	   else if (b[j] >= 60 && b[j] <= 63)
	   {
		   c[j] = 1.0F;
	   }
	   else
	   {
		   c[j] = 0.0F;
	   }
		d = d + a[j];
		e = e + c[j] * a[j];
	}
	GPA = e / (d + 0.0);
	System.out.printf("%.2f",GPA);
	}
}

