package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char gender[7];
	//		float h;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].gender = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].h = tempVar3;
			}
		}

		float[] a = new float[40];
		float[] b = new float[40];
		final String m = "male";
		int j = 0;
		int t = 0;
		for (i = 0;i < n;i++)
		{
			if (strcmp(stu[i].gender,m) == 0)
			{
				a[j] = stu[i].h;
				j++;
			}
			else
			{
				b[t] = stu[i].h;
				t++;
			}
		}

		int k;
		int q;
		float e;
		for (i = 0;i < j - 1;i++)
		{
			k = i;
			for (q = i + 1;q < j;q++)
			{
				if (a[k] > a[q])
				{
					k = q;
				}
			}
			e = a[k];
			a[k] = a[i];
			a[i] = e;
		}

		for (i = 0;i < t - 1;i++)
		{
			k = i;
			for (q = i + 1;q < t;q++)
			{
				if (b[k] < b[q])
				{
					k = q;
				}
			}
			e = b[k];
			b[k] = b[i];
			b[i] = e;
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%.2f ",b[i]);
		}
		System.out.printf("%.2f",b[t - 1]);

		return 0;
	}
}

