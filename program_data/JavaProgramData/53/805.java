package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[300];
	int[] nsz = new int[300];
	int n;
	int i;
	int j;
	int a;
	int b = 0;
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
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	for (j = 1;j < n;j++)
	{
		for (a = j;a > 0;a--)
		{
			if (sz[j] == sz[a - 1])
			{
				break;
			}
			else if ((sz[j] != sz[a - 1]) && (a == 1))
			{
				nsz[b] = sz[j];
				b++;
			}
			else if ((sz[j] != sz[a - 1]) && (a != 1))
			{
				continue;
			}
		}
	}
	System.out.printf("%d,",sz[0]);

	for (int c = 0;c < b;c++)
	{
		if (c == b - 1)
		{
			System.out.printf("%d",nsz[c]);
		}
		else
		{
			System.out.printf("%d,",nsz[c]);
		}
	}
	return 0;
	}
}

