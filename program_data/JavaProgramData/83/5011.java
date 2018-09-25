package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] cre = new int[10];
		int[] gra = new int[10];
		int i;
		float[] poi = new float[10];
		float sum = 0F;
		float gpa;
		float s = 0F;
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
				cre[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				gra[i] = Integer.parseInt(tempVar3);
			}
			if (gra[i] < 60)
			{
				poi[i] = 0F;
			}
			else if (gra[i] < 64)
			{
				poi[i] = 1.0F;
			}
			else if (gra[i] < 68)
			{
				poi[i] = 1.5F;
			}
			else if (gra[i] < 72)
			{
				poi[i] = 2.0F;
			}
			else if (gra[i] < 75)
			{
			poi[i] = 2.3F;
			}
			else if (gra[i] < 78)
			{
			poi[i] = 2.7F;
			}
			else if (gra[i] < 82)
			{
				poi[i] = 3.0F;
			}
			else if (gra[i] < 85)
			{
				poi[i] = 3.3F;
			}
			else if (gra[i] < 90)
			{
				poi[i] = 3.7F;
			}
			else
			{
				poi[i] = 4.0F;
			}
			sum += cre[i] * poi[i];
			s += cre[i];
		}
		gpa = sum / s;
		System.out.printf("%.2f",gpa);
		return 0;
	}
}

