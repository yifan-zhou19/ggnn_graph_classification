package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int b = 0;
		int a;
		int j;
		int[] array = new int[SIZE];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		array[i] = Integer.parseInt(tempVar);
	}
	}
	for (i = 0;i < n;i++)
	{
		a = k - array[i];
	for (j = 1;j < n;j++)
	{
		if (a == array[j])
		{
		b = 1;
		break;
		}
	else
	{
		continue;
	}
	}
	if (b == 1)
	{
		break;
	}
	}
	if (b == 1)
	{
		System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}
}

