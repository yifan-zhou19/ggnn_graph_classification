package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] array = new int[1000];
	float sum = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			array[i] = Integer.parseInt(tempVar2);
		}
	}
	for (int i = 0;i < n;i++)
	{
		sum += array[i];
	}
	sum = sum / n;
	sort(array,array + n);
	if (sum - array[0] * 1.0 > array[n - 1] * 1.0 - sum)
	{
		System.out.printf("%d",array[0]);
	}
	if (sum - array[0] * 1.0 == array[n - 1] * 1.0 - sum)
	{
		System.out.printf("%d,%d",array[0],array[n - 1]);
	}
	if (sum - array[0] * 1.0 < array[n - 1] * 1.0 - sum)
	{
		System.out.printf("%d",array[n - 1]);
	}
		return 0;
	}
}

