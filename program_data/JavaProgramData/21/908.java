package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data1
	//	{
	//		int num;
	//		float min;
	//	}
	//	data[1000], temp;
		int n;
		int i;
		int j;
		float sum = 0F;
		float max;
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
				data[i].num = tempVar2;
			}
			sum += data[i].num;
		}
		sum = sum / n;
		for (i = 0;i < n;i++)
		{
			if (data[i].num >= sum)
			{
				data[i].min = data[i].num - sum;
			}
			else
			{
				data[i].min = sum - data[i].num;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > 0;j--)
			{
				if (data[j].min > data[j - 1].min)
				{
					temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;

				}
			}
		}
		max = data[0].min;
		System.out.printf("%d", data[0].num);
		for (i = 1;Math.abs(data[i].min - max) < 1e-6;i++)
		{
			System.out.printf(",%d", data[i].num);
		}
		return 0;
	}




}

