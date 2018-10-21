package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {3, 5, 7};
		int b;
		int m = 0;
		int[] c = new int[3];
		int j = 0;
		int i;
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 3;i++)
	{
		if (b % a[i] == 0)
		{
		m = m + 1;
	c[j] = a[i];
	j = j + 1;
		}
	}
	if (m == 0)
	{
	System.out.print("n");
	}
	else if (m == 1)
	{
	System.out.print(c[0]);
	}
	else
	{
		for (j = 0;j < m - 1;j++)
		{
		System.out.print(c[j]);
		System.out.print(" ");
		}
	System.out.print(c[m - 1]);
	}
	return 0;
	}


}

