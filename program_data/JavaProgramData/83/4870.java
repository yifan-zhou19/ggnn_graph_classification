package <missing>;

public class GlobalMembers
{
	//*************
	//????*****
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		float[] gra = new float[10];
		float[] sum = new float[10];
		float Sum1 = 0F;
		float Sum2 = 0F;
		float GPA = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??????
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??????
		for (i = 0;i < n;i++)
		{
			if (b[i] <= 100 && b[i] >= 90)
			{
				gra[i] = 4.0F;
			}
			if (b[i] <= 89 && b[i] >= 85)
			{
				gra[i] = 3.7F;
			}
			if (b[i] <= 84 && b[i] >= 82)
			{
				gra[i] = 3.3F;
			}
			if (b[i] <= 81 && b[i] >= 78)
			{
				gra[i] = 3.0F;
			}
					if (b[i] <= 77 && b[i] >= 75)
					{
				gra[i] = 2.7F;
					}
			if (b[i] <= 74 && b[i] >= 72)
			{
				gra[i] = 2.3F;
			}
			if (b[i] <= 71 && b[i] >= 68)
			{
				gra[i] = 2.0F;
			}
				if (b[i] <= 67 && b[i] >= 64)
				{
				gra[i] = 1.5F;
				}
			if (b[i] <= 63 && b[i] >= 60)
			{
				gra[i] = 1.0F;
			}
			if (b[i] < 60)
			{
				gra[i] = 0.0F;
			}
		} //??????????
			for (i = 0;i < n;i++)
			{
				sum[i] = a[i] * gra[i];
			} //???????????
		for (i = 0;i < n;i++)
		{
				Sum2 = Sum2 + sum[i];
		} //??????????
		for (i = 0;i < n;i++)
		{
			Sum1 = Sum1 + a[i];
		} //??????????
		GPA = Sum2 / Sum1; //?????
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

