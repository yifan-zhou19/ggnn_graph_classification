package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] an = new int[20];
	int fb = int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			an[i] = Integer.parseInt(tempVar2);
		}
	}
	for (j = 1;j <= n;j++)
	{
		if (an[j - 1] == 1 || an[j - 1] == 2)
		{
				System.out.print("1\n");
		}
		else
		{
			System.out.printf("%d\n",fb(an[j - 1]));
		}
	}
	return 0;
	}

	public static int fb(int a)
	{
		int n1 = 1;
		int n2 = 1;
		int m;
		int t;
		for (t = 3;t <= a;t++)
		{
			m = n1 + n2;
			n1 = n2;
			n2 = m;
		}
		return m;
	}
}

