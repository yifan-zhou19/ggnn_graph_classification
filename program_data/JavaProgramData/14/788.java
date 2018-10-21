package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int[] sum = new int[100000];
		int max = 0;
		int second = 0;
		int third = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id;
	//		int chi;
	//		int math;
	//	};
		student[] wangchong = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				wangchong[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				wangchong[i].chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				wangchong[i].math = tempVar4;
			}
			sum[i] = wangchong[i].chi + wangchong[i].math;
			if (sum[i] > third)
			{
				if (sum[i] <= second)
				{
					third = sum[i];
					c = i + 1;
				}
				else
				{
					if (sum[i] <= max)
					{
						third = second;
						second = sum[i];
						c = b;
						b = i + 1;
					}
					else
					{
						third = second;
						c = b;
						second = max;
						b = a;
						max = sum[i];
						a = i + 1;
					}
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",a,max,b,second,c,third);
	}
}

