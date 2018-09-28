package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] u = new int[100];
		int[] v = new int[100];
		float[] a = new float[100];
		float[] b = new float[100];
		float t;
		float s;
		float r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0.0F;
		s = 0.0F;
		for (int i = 0;i <= (n - 1);i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					u[i] = Integer.parseInt(tempVar2);
				}
				s = s + u[i] * (1.0);
		}
		for (int i = 0;i <= (n - 1);i++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					v[i] = Integer.parseInt(tempVar3);
				}
		}
		for (int i = 0;i <= (n - 1);i++)
		{
			if ((v[i] >= 90) && (v[i] <= 100))
			{
										a[i] = 4.0F;
			}
										else if ((v[i] <= 89) && (v[i] >= 85))
										{
											 a[i] = 3.7F;
										}
											 else if ((v[i] <= 84) && (v[i] >= 82))
											 {
											 a[i] = 3.3F;
											 }
											 else if ((v[i] <= 81) && (v[i] >= 78))
											 {
											 a[i] = 3.0F;
											 }
											 else if ((v[i] <= 77) && (v[i] >= 75))
											 {
											 a[i] = 2.7F;
											 }
											 else if ((v[i] <= 74) && (v[i] >= 72))
											 {
											 a[i] = 2.3F;
											 }
											 else if ((v[i] <= 71) && (v[i] >= 68))
											 {
											 a[i] = 2.0F;
											 }
											 else if ((v[i] <= 67) && (v[i] >= 64))
											 {
											 a[i] = 1.5F;
											 }
											 else if ((v[i] <= 63) && (v[i] >= 60))
											 {
											 a[i] = 1.0F;
											 }
											 else if ((v[i] < 60))
											 {
											 a[i] = 0.0F;
											 }
		}
		for (int i = 0;i <= (n - 1);i++)
		{
				b[i] = u[i] * 1.0 * a[i];
				t = t + b[i];
		}
				r = t / s;
		System.out.printf("%.2f",r);
		return 0;
	}

}

