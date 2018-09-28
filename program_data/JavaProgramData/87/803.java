package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] s = new int[6];
	int N = 0;
	for (int i = 0;i < 1000;i++)
	{
	for (int j = 0;j < 6;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s[j] = Integer.parseInt(tempVar);
	}
	}
	if (s[0] != 0)
	{
	N = (s[3] + 11 - s[0]) * 3600 + (s[4] + 59 - s[1]) * 60 + (s[5] + 60 - s[2]);
	System.out.printf("%d\n",N);
	}
	else
	{
	break;
	}
	}
	return 0;
	}

}

