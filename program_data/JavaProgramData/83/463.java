package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int t;
		int s = 0;
		float[] c = new float[10];
		float jx = 0.0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			t = b[i];
			if (t < 60)
			{
				c[i] = 0.0F;
			}
			else if (t <= 63)
			{
				c[i] = 1.0F;
			}
			else if (t <= 67)
			{
				c[i] = 1.5F;
			}
			else if (t <= 71)
			{
				c[i] = 2.0F;
			}
			else if (t <= 74)
			{
				c[i] = 2.3F;
			}
			else if (t <= 77)
			{
				c[i] = 2.7F;
			}
			else if (t <= 81)
			{
				c[i] = 3.0F;
			}
			else if (t <= 84)
			{
				c[i] = 3.3F;
			}
			else if (t <= 89)
			{
				c[i] = 3.7F;
			}
			else if (t <= 100)
			{
				c[i] = 4F,0;
			}
			jx = jx + a[i] * c[i];
			s = s + a[i];
		}
		System.out.printf("%.2f\n",jx / s);
	}






}

