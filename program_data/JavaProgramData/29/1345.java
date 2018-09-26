package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int j;
		float[] sl = new float[1000];
		float[] add = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sl[0] = 1F;
			sl[1] = 2F;
			add[j] = 0F;
			for (i = 0;i < n;i++)
			{
				add[j] = sl[i + 1] / sl[i] + add[j];
				sl[i + 2] = sl[i] + sl[i + 1];
			}
		}
		for (j = 0;j < m;j++)
		{
			System.out.printf("%.3f\n",add[j]);
		}
		return 0;
	}

}

