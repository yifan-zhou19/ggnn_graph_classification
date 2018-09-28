package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	int[] m = new int[100];
	for (i = 0;i < n;i++)
	{
		m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int m1 = 0;
	int m2 = 0;
	for (i = 0;i < n;i++)
	{
		if (m[i] > m1)
		{
			m1 = m[i];
		}
	}
	for (i = 0;i < n;i++)
	{
		if (m[i] > m2 && m[i] < m1)
		{
			m2 = m[i];
		}
	}
	System.out.print(m1);
	System.out.print("\n");
	System.out.print(m2);
	System.out.print("\n");
	return 0;
	}

}

