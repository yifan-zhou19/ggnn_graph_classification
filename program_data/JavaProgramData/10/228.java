package <missing>;

public class GlobalMembers
{
	public static int[] count = new int[30];
	public static int[] hgt = new int[30];
	public static int n;
	public static int i;
	public static int j;
	public static int max;
	public static int temp;
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void m(int s, int t);
	public static void Main()
	{
		for (i = 1;i <= 25;i++)
		{
			count[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hgt[i] = Integer.parseInt(tempVar2);
			}
			count[1] = 1;
		}
		for (i = 2;i <= n;i++)
		{
			temp = 0;
			for (j = 1;j < i;j++)
			{
				if (hgt[i] <= hgt[j])
				{
					if (temp < count[j])
					{
						temp = count[j];
					}
				}
			}
			count[i] = temp + 1;
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			if (max < count[i])
			{
				max = count[i];
			}
		}
		System.out.printf("%d\n",max);
	}
}

