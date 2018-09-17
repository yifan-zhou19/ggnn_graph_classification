package <missing>;

public class GlobalMembers
{
	public static void insertSort(float[] arr, int len)
	{
		int i = 0;
		int j = 0;
		float tmpData;
		for (i = 1;i < len;i++)
		{
			j = i;
			tmpData = (arr + i);
			while (j > 0 && tmpData < arr[j - 1])
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = tmpData;
		}
	}

	public static int Main()
	{
		int n = 0;
		float[] male = new float[40];
		float[] female = new float[40];
		int maleNum = 0;
		int femaleNum = 0;
		String sex = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			if (strcmp(sex, "male") == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					male[maleNum++] = Float.parseFloat(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					female[femaleNum++] = Float.parseFloat(tempVar4);
				}
			}
		}

		insertSort(male, maleNum);
		insertSort(female, femaleNum);

		int i = 0;
		for (i = 0; i < maleNum - 1; ++i)
		{
			System.out.printf("%.2f ", male[i]);
		}
		System.out.printf("%.2f ", male[i]);

		for (i = femaleNum - 1; i > 0; --i)
		{
			System.out.printf("%.2f ", female[i]);
		}
		System.out.printf("%.2f", female[i]);

		return 0;
	}
}

