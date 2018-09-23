package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		float tmp;
		float[] a = new float[40];
		float[] b = new float[40];
		int t = 0;
		int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char sex[5];
	//		float high;
	//	}
	//	stu[40];



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
				stu[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].high = tempVar3;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (strcmp(stu[i].sex,"male") == 0)
			{
				a[t] = stu[i].high;
				t = t + 1;
			}
			else
			{
				b[s] = stu[i].high;
				s = s + 1;
			}
		}

		for (i = 0;i < t - 1;i++)
		{
			for (j = i + 1;j < t;j++)
			{
				if (a[i] > a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		for (i = 0;i < s - 1;i++)
		{
			for (j = i + 1;j < s;j++)
			{
				if (b[i] < b[j])
				{
					tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
				}
			}
		}

		for (i = 0;i < t;i++)
		{
			stu[i].high = a[i];
		}
		for (i = t;i < s + t;i++)
		{
			stu[i].high = b[i - t];
		}
		System.out.printf("%.2f",stu[0].high);
		for (i = 1;i < s + t;i++)
		{
			System.out.printf("% .2f",stu[i].high);
		}
	}
}

