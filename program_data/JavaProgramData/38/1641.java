package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] shuru = new double[100];
		double[] shu = shuru;
		double fangjungen = new double(double shu[0],int k);
		int n;
		int k;
		int i;
		int j;
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
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shu[j] = tempVar3;
				}
			}
		tangible.RefObject<Double> tempRef_shu = new tangible.RefObject<Double>(shu);
			System.out.printf("%.5lf\n",fangjungen(tempRef_shu, k));
			shu = tempRef_shu.argValue;
		}
			return 0;
	}
	public static double fangjungen(tangible.RefObject<Double> shu, int k)
	{
		int i;
		double zong = 0.0;
		double pingjun;
		double result;
		for (i = 0;i < k;i++)
		{
			zong = zong + *(shu.argValue + i);
		}
		pingjun = zong / k;
		zong = 0.0;
		for (i = 0;i < k;i++)
		{
			zong = zong + (*(shu.argValue + i) - pingjun) * (*(shu.argValue + i) - pingjun);
		}
		result = Math.sqrt((zong / k));
		return result;
	}
}

