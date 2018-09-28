package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] t = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	t[0] = n;
	for (i = 0;t[i] != 1;i++)
	{
	if (t[i] % 2 == 0)
	{
		t[i + 1] = t[i] / 2;
		System.out.printf("%d/2=%d\n",t[i],t[i + 1]);
	}
	else
	{
		t[i + 1] = 3 * t[i] + 1;
		System.out.printf("%d*3+1=%d\n",t[i],t[i + 1]);
	}
	}
	System.out.print("End\n");
	return 0;
	}
}

