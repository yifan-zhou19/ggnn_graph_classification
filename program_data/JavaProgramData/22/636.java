package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char c = ',';
	int i = 0;
	int[] a = new int[301];
	int j;
	int max = 0;
	while (c == ',')
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		i++;
	}
	for (j = 0;j < i;j++)
	{
		if (a[j] > max)
		{
			max = a[j];
		}
	}
	for (j = 0;j < i;j++)
	{
		if (a[j] == max)
		{
			a[j] = 0;
		}
	}
	max = 0;
	for (j = 0;j < i;j++)
	{
		if (a[j] > max)
		{
			max = a[j];
		}
	}
	if (max == 0)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",max);
	}
	}

}

