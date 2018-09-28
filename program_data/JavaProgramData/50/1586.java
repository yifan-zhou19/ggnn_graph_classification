package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int w;
	int i;
	int j;
	int sum = 13;
	int day;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	for (j = 1;j <= 12;j++)
	{
		for (i = 0;i <= j - 1;i++)
		{
		sum = sum + a[i];
		}
		day = sum % 7;
		day = (w + day) % 7;
		if (day == 6)
		{
			System.out.printf("%d\n",j);
		}
		sum = 13;
	}
	return 0;
	}
}

