package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int T = 0;
		int A = 0;
		int B = 0;
		int[][] sz = new int[200][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			for (int a = 0;a < 2;a++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][a] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int b = 0;b < n;b++)
		{
					   if ((sz[b][0] == 0 && sz[b][1] == 1) || (sz[b][0] == 1 && sz[b][1] == 2) || (sz[b][0] == 2 && sz[b][1] == 0))
					   {
				A++;
					   }
			if ((sz[b][0] == 1 && sz[b][1] == 0) || (sz[b][0] == 2 && sz[b][1] == 1) || (sz[b][0] == 0 && sz[b][1] == 2))
			{
				B++;
			}
		}
		if (A == B)
		{
		System.out.print("Tie");
		}
		if (A > B)
		{
		System.out.print("A");
		}
		if (A < B)
		{
		System.out.print("B");
		}
	return 0;
	}
}

