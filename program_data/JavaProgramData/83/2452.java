package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		float r;
		float rt = 0F;
		float bt = 0.00F;
		float GPA;
		int[] scores = new int[100];
		float[] point = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				scores[i] = Integer.parseInt(tempVar2);
			}
			bt += scores[i];
		}
			for (j = 0;j < a;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[j] = Float.parseFloat(tempVar3);
			}
			if (90F <= point[j] != 0 && point[j] <= 100F)
			{
				r = 4.00 * scores[j];
			}
			if (85F <= point[j] != 0 && point[j] <= 89F)
			{
				r = 3.70 * scores[j];
			}
			if (82F <= point[j] != 0 && point[j] <= 84F)
			{
				r = 3.30 * scores[j];
			}
			if (78F <= point[j] != 0 && point[j] <= 81F)
			{
				r = 3.00 * scores[j];
			}
			if (75F <= point[j] != 0 && point[j] <= 77F)
			{
				r = 2.70 * scores[j];
			}
			if (72F <= point[j] != 0 && point[j] <= 74F)
			{
				r = 2.30 * scores[j];
			}
			if (68F <= point[j] != 0 && point[j] <= 71F)
			{
				r = 2.00 * scores[j];
			}
			if (64F <= point[j] != 0 && point[j] <= 67F)
			{
				r = 1.50 * scores[j];
			}
			if (60F <= point[j] != 0 && point[j] <= 63F)
			{
				r = 1.00 * scores[j];
			}
			if (point[j] < 60F)
			{
				r = 0.00 * scores[j];
			}
			rt = rt + r;
			}
			GPA = 1.00 * rt / bt;
			System.out.printf("%.2f",GPA);
			return 0;
	}
}

