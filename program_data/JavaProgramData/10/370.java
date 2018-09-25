package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[100];
	int[] b = new int[100];
	int bm = -1;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 100;i++)
	{
		b[i] = 1;
	}
	for (i = 1;i <= n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (j = 1;j < i;j++)
	{
		if (a[j] >= a[i] != 0 && (b[j] + 1) > b[i])
		{
			b[i] = (b[j] + 1);
		}
	}
	if (b[i] > bm)
	{
		bm = b[i];
	}
	}

	System.out.print(bm);


	}

}

