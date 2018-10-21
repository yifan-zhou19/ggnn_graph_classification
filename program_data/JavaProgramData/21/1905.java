package <missing>;

public class GlobalMembers
{
	public static float my_abs(float a)
	{
		return a < 0F ? -a : a;
	}

	public static int Main()
	{
		//freopen("in.txt", "r", stdin);

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		float avg = 0F;
		float[] data = new float[400];
		for (int i = 0;i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i] = Float.parseFloat(tempVar2);
			}
			avg += data[i];
		}
		avg /= n;

		float[] dif = new float[400];
		for (int i = 0;i < n; i++)
		{
			dif[i] = my_abs(data[i] - avg);
		}

		float maxDif = dif[0];
		float maxIdx = 0F;
		for (int i = 1;i < n; i++)
		{
			if (maxDif < dif[i])
			{
				maxDif = dif[i];
				maxIdx = i;
			}
		}

		int[] result = new int[400];
		int sp = 0;
		for (int i = 0; i < n; i++)
		{
			if (dif[i] == maxDif)
			{
				result[sp++] = data[i];
			}
		}

		if (sp == 2)
		{
			if (result[0] > result[1])
			{
				int temp = result[0];
				result[0] = result[1];
				result[1] = temp;
			}
		}

		for (int i = 0; i < sp; i++)
		{
			System.out.printf("%d%c", result[i], i == sp - 1 ? '\n' : ',');
		}

		return 0;
	}
}

