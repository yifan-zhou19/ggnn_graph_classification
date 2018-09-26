package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		float GPA;
		float[] c = new float[10];
		float sum_a;
		float sum_b;
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
						 if (a[i] < 60)
						 {
						 c[i] = 0F;
						 }
						 else if (a[i] <= 63)
						 {
						 c[i] = 1.0F;
						 }
						 else if (a[i] <= 67)
						 {
						 c[i] = 1.5F;
						 }
						 else if (a[i] <= 71)
						 {
						 c[i] = 2.0F;
						 }
						 else if (a[i] <= 74)
						 {
						 c[i] = 2.3F;
						 }
						 else if (a[i] <= 77)
						 {
						 c[i] = 2.7F;
						 }
						 else if (a[i] <= 81)
						 {
						 c[i] = 3.0F;
						 }
						 else if (a[i] <= 84)
						 {
						 c[i] = 3.3F;
						 }
						 else if (a[i] <= 89)
						 {
						 c[i] = 3.7F;
						 }
						 else
						 {
						 c[i] = 4.0F;
						 }
						 c[i] = c[i] * b[i];
		}
						 for (i = 1,sum_a = 0F,sum_b = 0F;i <= n;i++)
						 {
														  sum_a += c[i];
														  sum_b += b[i];
						 }
														  GPA = sum_a / sum_b;
														  System.out.printf("%.2f",GPA);
														  return 0;
	}
}

