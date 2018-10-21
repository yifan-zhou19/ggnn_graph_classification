package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int lim = 0;
	int i;
	int j;
	int[] a = new int[301];
	int d = 0;
	a[0] = 0;
	char ch;
	do
	{
		lim = lim + 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[lim] = Integer.parseInt(tempVar);
		}
		ch = System.in.read();
	}while (ch != '\n');

	for (i = 1;i < lim;i++)
	{
		for (j = lim;j > i;j--)
		{
		if (a[j] > a[j - 1])
		{
			a[j] = a[j] + a[j - 1];
			a[j - 1] = a[j] - a[j - 1];
			a[j] = a[j] - a[j - 1];
		}
		}
	}
	if (lim == 1)
	{
		System.out.print("No");
	}
	else
	{
	for (i = 2;i <= lim;i++)
	{
	if (a[i] != a[1])
	{
		System.out.printf("%d",a[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto cobra_loop;
	}
	}
	System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	cobra_loop:
	return 0;
	}
	}
}

