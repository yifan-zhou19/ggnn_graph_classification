package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i;
	int j;
	int k;
	int n;
	int di;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	di = 12;
	for (i = 0;i < 12;i++)
	{
		di = di + m[i];
	j = (di + n) % 7;
	if (j == 5)
	{
		System.out.printf("%d\n",i + 1);
	}

	}



	System.in.read();
	System.in.read();
	System.in.read();
	}

}

