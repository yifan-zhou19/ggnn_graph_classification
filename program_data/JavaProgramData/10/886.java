package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			int[] h = new int[n];
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					h[i] = Integer.parseInt(tempVar2);
				}
			}
			int[] m = new int[n];
			for (int i = 0;i < n;i++)
			{
				m[i] = 0;
			}
			for (int i = n - 1;i >= 0;i--)
			{
					for (int j = i;j < n;j++)
					{
								if (h[i] >= h[j] != 0 && m[i] - 1 < m[j])
								{
									m[i] = m[j] + 1;
								}
								if (j == n - 1 && m[i] == 0)
								{
									m[i] = 1;
								}
					}
			}
			int max = 0;
			for (int i = 0;i < n;i++)
			{
				if (m[i] > max)
				{
					max = m[i];
				}
			}
			System.out.printf("%d",max);

	}

}

