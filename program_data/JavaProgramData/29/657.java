package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] shuzu = new float[NUM];
		float[] shulie = new float[NUM];
		float[] qiuhe = new float[NUM];
		float s = 0F;
		shuzu[0] = 1F,shuzu[1] = 2F;
		for (int j = 0;j < NUM - 2;j++)
		{
			shuzu[j + 2] = shuzu[j] + shuzu[j + 1];
		}
		for (int i = 0;i < NUM - 2;i++)
		{
			shulie[i] = shuzu[i + 1] / shuzu[i];
		}
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(qiuhe[k]) = Float.parseFloat(tempVar2);
			}
			for (int l = 0;l < qiuhe[k];l++)
			{
				s += shulie[l];
			}
			System.out.printf("%.3f\n",s);
			s = 0F;
		}
		return 0;
	}
}

