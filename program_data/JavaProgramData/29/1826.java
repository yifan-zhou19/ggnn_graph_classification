package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int j;
		float s;
		float[] r = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= m;i++)
		{
			r[i] = 0F;
			s = 1.0F;
				for (j = 1;j <= n[i];j++)
				{

						s = 1.0 + 1.0 / s;
						r[i] = r[i] + s;
				}
				System.out.printf("%.3f\n",r[i]);
		}
		return 0;
	}
}

