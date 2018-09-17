package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int max;
	int[] a = new int[100];
	int[] b = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	b[0] = 1; //???
	for (i = 1;i < n;i++)
	{
		b[i] = 1; //b[i]????1
		for (j = 0;j < i;j++)
		{
			if (a[i] <= a[j] != 0 && b[j] + 1> b[i])
			{
			   b[i] = b[j] + 1;
			}
		}
	}
	max = 0;
	for (i = 0;i < n;i++) //?????????????????
	{
		if (b[i] > max)
		{
		   max = b[i];
		}
	}
	System.out.print(max);
	System.out.print("\n");
	return 0;
	}

}

