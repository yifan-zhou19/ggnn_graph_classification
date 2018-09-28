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
		int[][] sz = new int[200][2];
		int i;
		int k;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar2);
				}
			}
		}
		int A = 0;
		int B = 0;
		for (i = 0;i < n;i++)
		{
			if ((sz[i][0] == 0 && sz[i][1] == 1) || (sz[i][0] == 1 && sz[i][1] == 2) || (sz[i][0] == 2 && sz[i][1] == 0))
			{
				A = A + 1;
			}
			else if (sz[i][0] == sz[i][1])
			{
				B = B;
			}
			else
			{
				B++;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		else if (A == B)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}


}

