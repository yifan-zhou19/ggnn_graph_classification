package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int n;
		int i = 1;
		float jidian;
		float GPA;
		float[] c = new float[10];
		float y = 0F;
		float x = 0F;
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
			if ((90 <= a[i]) && (a[i] <= 100))
			{
				jidian = 4.0F;
			}
			if ((85 <= a[i]) && (a[i] <= 89))
			{
				jidian = 3.7F;
			}
			if ((82 <= a[i]) && (a[i] <= 84))
			{
				jidian = 3.3F;
			}
			if ((78 <= a[i]) && (a[i] <= 81))
			{
				jidian = 3.0F;
			}
			if ((75 <= a[i]) && (a[i] <= 77))
			{
				jidian = 2.7F;
			}
			if ((72 <= a[i]) && (a[i] <= 74))
			{
				jidian = 2.3F;
			}
			if ((68 <= a[i]) && (a[i] <= 71))
			{
				jidian = 2.0F;
			}
			if ((64 <= a[i]) && (a[i] <= 67))
			{
				jidian = 1.5F;
			}
			if ((60 <= a[i]) && (a[i] <= 63))
			{
				jidian = 1.0F;
			}
			if (a[i] < 60)
			{
				jidian = 0F;
			}
			c[i] = jidian * b[i];
		}
		for (i = 1;i <= n;i++)
		{
			x = x + c[i];
			y = y + b[i];
		}
		GPA = x / y;
		System.out.printf("%.2f\n",GPA);
	}


}

