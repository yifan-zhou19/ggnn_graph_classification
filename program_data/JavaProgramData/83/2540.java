package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10]; //????
		int point; //??????
		float[] b = new float[10]; //?????
		int n; //????
		float GPA;
		float total = 0F;
		int i = 0;
		float sum = 0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point = Integer.parseInt(tempVar3);
			}
			if (point >= 90 && point <= 100)
			{
				b[i] = 4.0F;
			}
			if (point >= 85 && point <= 89)
			{
				b[i] = 3.7F;
			}
			if (point >= 82 && point <= 84)
			{
				b[i] = 3.3F;
			}
			if (point >= 78 && point <= 81)
			{
				b[i] = 3.0F;
			}
			if (point >= 75 && point <= 77)
			{
				b[i] = 2.7F;
			}
			if (point >= 72 && point <= 74)
			{
				\
				{
				b[i] = 2.3F;
				}
			}
			if (point >= 68 && point <= 71)
			{
				b[i] = 2.0F;
			}
			if (point >= 64 && point <= 67)
			{
				b[i] = 1.5F;
			}
			if (point >= 60 && point <= 63)
			{
				b[i] = 1.0F;
			}
			if (point < 60)
			{
				b[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i] * b[i];

		}
		for (i = 0;i < n;i++)
		{
			total = total + a[i];
		}
		GPA = sum / total;
		System.out.printf("%.2f",GPA);
		return 0;
	}


}

