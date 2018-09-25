package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		float average;
		float sum = 0F;
		float distance;
		float maxdistance;
		float temp;
		float sign;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int num[300];
		int[] num = new int[300];
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
				num[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + num[i];
		}
		average = sum / n;
		for (i = 1;i < n;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (num[j] < num[j - 1])
				{
					temp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp;
				}
			}
		}
		maxdistance = 0F;
		for (i = 0;i < n;i++)
		{
			distance = (num[i] - average > 0F)?(num[i] - average):(average - num[i]);
			if (distance > maxdistance)
			{
				maxdistance = distance;
			}
		}
		for (i = 0;i < n;i++)
		{
			distance = (num[i] - average > 0F)?(num[i] - average):(average - num[i]);
			if (distance == maxdistance)
			{
				System.out.printf("%d",num[i]);
				break;
			}
		}
		for (i++;i < n;i++)
		{
			distance = (num[i] - average > 0F)?(num[i] - average):(average - num[i]);
			if (distance == maxdistance)
			{
				System.out.printf(",%d",num[i]);
				break;
			}
		}
		System.out.print("\n");

		return 0;
	}
}

