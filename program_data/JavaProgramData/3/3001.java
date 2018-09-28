package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int[] s = new int[1000];
	for (int a = 0;a < n;a++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(s[a]) = Integer.parseInt(tempVar3);
		}
	}
	int b;
	for (int c = 0;c < n;c++)
	{
	for (int i = 0;i < n;i++)
	{
		b = s[c] + s[i];
		if (b == k)
		{
		System.out.print("yes");
		return 0;
		}
	}
	}
	System.out.print("no");
	return 0;
	}
}

