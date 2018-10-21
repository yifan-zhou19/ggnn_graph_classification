package <missing>;

public class GlobalMembers
{
	public static int comp(Object a, Object b)
	{
		return *(float)a - (float)b;
	}

	public static int Main()
	{
		int n;
		int count1 = 0;
		int count2 = 0;
		int i;
		int j;
		float num;
		float[] a = new float[40];
		float[] b = new float[40];
		float temp;
		String string = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				String = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num = Float.parseFloat(tempVar3);
			}
			if (String[0] == 'm')
			{
				 a[count1++] = num;
			}
			else if (String[0] == 'f')
			{
				 b[count2++] = num;
			}

		}
		//qsort(a,count1,sizeof(float),comp);
		//qsort(b,count2,sizeof(float),comp);
		for (i = 0;i <= count1 - 2;i++)
		{
			for (j = 0;j <= count1 - 2 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0;i <= count2 - 2;i++)
		{
			for (j = 0;j <= count2 - 2 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0;i <= count1 - 1;i++)
		{
			System.out.printf("%.2f ",((float)(a[i])));
		}
		for (i = 0;i <= count2 - 2;i++)
		{
			System.out.printf("%.2f ",((float)(b[i])));
		}
		System.out.printf("%.2f",((float)(b[count2 - 1])));
		System.out.print("\n");

		return 0;
	}
}

