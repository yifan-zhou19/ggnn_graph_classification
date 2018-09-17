package <missing>;

public class GlobalMembers
{
	public static void line(int n, float[] p)
	{
		 int i;
		 int j;
		 float k;
		 for (i = 0;i < n - 1;i++)
		 {
						 for (j = 0;j < n - 1 - i;j++)
						 {
										   if (p[j] > p[j + 1])
										   {
														  k = p[j];
														  p[j] = p[j + 1];
														  p[j + 1] = k;
										   }
						 }
		 }
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		   char gender[10];
	//		   float tall;
	//	};
		people[] people = tangible.Arrays.initializeWithDefaultpeopleInstances(45);
		int n;
		int i;
		int j;
		int k;
		int flag;
		j = k = 0;
		flag = 1;
		float[] m = new float[45];
		float[] f = new float[45];
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
				people[i].gender = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				people[i].tall = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
						if (people[i].gender[0] == 'm')
						{
													m[j] = people[i].tall;
													j++;
						}
						else
						{
							 f[k] = people[i].tall;
							 k++;
						}
		}
		line(j, m);
		line(k, f);
		for (i = 0;i < j;i++)
		{
						if (flag != 0)
						{
								System.out.printf("%.2f",m[i]);
								flag = 0;
						}
						else
						{
							System.out.printf(" %.2f",m[i]);
						}
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf(" %.2f",f[i]);
		}
		return 0;
	}
}

