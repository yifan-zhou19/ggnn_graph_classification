package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int count;
		int sentry = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * values;
		int values;
		int i;
		int sum = 0;
		double ave;
		double temp;
		double distance = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * mid;
		int mid;

		String tempVar = ConsoleInput.scanfRead(" ");
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		values = (int)malloc(count * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		mid = (int)malloc(count * (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < count; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(values + i) = Integer.parseInt(tempVar2);
			}
			sum += *(values + i);
		}

		ave = 1.0 * sum / count;

		for (i = 0; i < count; i++)
		{
			temp = Math.abs(1.0 * values[i] - ave);
			if (temp > distance)
			{
				distance = temp;
				mid[0] = values[i];
				sentry = 0;
			}
			else if (temp == distance)
			{
				sentry++;
				mid[sentry] = values[i];
			}
		}


		System.out.printf("%d", mid[0]);


		for (i = 1; i <= sentry; i++)
		{
			System.out.printf(",%d", mid[i]);
		}
	}

}

