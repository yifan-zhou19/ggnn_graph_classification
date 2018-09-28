package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		float a = 1F;
		float b = 2F;
		float c;
		float s = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		float[] result = new float[m];
		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (int k = 0;k < n;k++)
			{
				s += b / a;
				c = a + b;
				a = b;
				b = c;

			}
			result[i] = s;
			s = 0F;
			a = 1F;
			b = 2F;
		}
		for (int i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",result[i]);
		}
		return 0;
	}
}

