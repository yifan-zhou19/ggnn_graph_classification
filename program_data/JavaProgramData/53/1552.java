package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[500];
		int n;
		int i = 0;
		int j;
		for (scanf("%d", n);i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m[i] = Integer.parseInt(tempVar);
			}
		}
		System.out.printf("%d",m[0]);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (m[i] == m[j])
				{
				m[i] = 0;
				break;
				}
			}
			if (m[i] != 0)
			{
				System.out.printf(",%d",m[i]);
			}
		}
		return 0;
	}
}

