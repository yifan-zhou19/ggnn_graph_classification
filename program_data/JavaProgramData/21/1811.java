package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300];
		int n;
		int i;
		int j;
		int min;
		int temp;
	float sum = 0F;
	float average;
	float a;
	float b;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
		min = i;
	for (j = i + 1;j < n;j++)
	{
		if (num[min] > num[j])
		{
			min = j;
		}
	}
	temp = num[i];
	num[i] = num[min];
	num[min] = temp;
	}
	for (i = 0;i < n;i++)
	{
	sum += num[i];
	}
	average = sum / n;
	a = average - num[0];
	b = num[n - 1] - average;
	if (a > b)
	{
		System.out.print(num[0]);
		System.out.print("\n");
	}
	else if (a == b)
	{
		System.out.print(num[0]);
		System.out.print(",");
		System.out.print(num[n - 1]);
		System.out.print("\n");
	}
	else
	{
		System.out.print(num[n - 1]);
		System.out.print("\n");
	}
	return 0;
	}

}

