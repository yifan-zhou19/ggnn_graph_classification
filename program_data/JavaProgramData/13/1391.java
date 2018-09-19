package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[20000];
		int i;
		int j = 0;
		int count = 0;
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
			for (j = 0;j < i;j++)
			{
				if (m[i] == m[j])
				{
					break;
				}
			}
			if (i == j)
			{
				if (count == 0)
				{
					System.out.printf("%d",m[i]);
					count++;
				}
				else
				{
					System.out.printf(" %d",m[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

