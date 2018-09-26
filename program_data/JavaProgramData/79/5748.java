package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			int[] out = new int[301];
			for (int i = 0; i < n; i++)
			{
				out[i] = 0;
			}
			int cur_id = -1;
			// ??n-1???
			for (int i = 0; i < n - 1; i++)
			{
				int count = 0;
				while (count < m)
				{
					cur_id = (cur_id + 1) % n;
					if (out[cur_id] == 0)
					{
						count += 1;
					}
				}
				out[cur_id] = 1;
			}
			for (int i = 0; i < n; i++)
			{
				if (out[i] == 0)
				{
					System.out.printf("%d\n", i + 1);
				}
			}
		}
		return 0;
	}
}

