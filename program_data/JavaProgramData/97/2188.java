package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int bill;
		int[] pay = new int[6];
		int[] unit = {100, 50, 20, 10, 5, 1};
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bill = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 6;i++)
		{
			pay[i - 1] = bill / unit[i - 1];
			bill -= pay[i - 1] * unit[i - 1];
		}
		for (j = 1;j <= 6;j++)
		{
			System.out.printf("%d\n",pay[j - 1]);
		}
		return 0;
	}
}

