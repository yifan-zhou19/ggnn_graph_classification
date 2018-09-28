package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int i;
		int j;
		int x;
		int n;
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
			for (j = i;j > 0;j--)
			{
				if (m[j] > m[j - 1])
				{
					x = m[j];
					m[j] = m[j - 1];
					m[j - 1] = x;
				}
			}
		}
		System.out.printf("%d\n",m[0]);
		System.out.printf("%d\n",m[1]);
		return 0;

	}
}

