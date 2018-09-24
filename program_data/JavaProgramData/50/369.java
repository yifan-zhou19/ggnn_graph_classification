package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int fw;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		fw = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 12;i++)
	{
	for (j = 0;j < monthday[i]; j++)
	{
	if (fw == 5 && j == 12)
	{
		System.out.printf("%d\n", (i + 1));
	}
	fw = (fw == 7) ? 1 : (fw + 1);
	}
	}
	return 0;
	}
}

