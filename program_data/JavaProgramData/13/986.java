package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int p = 0;
	int[] m = new int[20000];
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
		m[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
		j = 0;
		while (j < i)
		{
			if (m[i] == m[j])
			{
				break;
			}
			j++;
		}
		if (j == i)
		{
		if ((i < n) && (i>0))
		{
			System.out.print(" ");
		}
		System.out.printf("%d",m[i]);
		p++;
		}
	}
	return 0;
	}
}

