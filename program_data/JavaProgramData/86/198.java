package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] A = new int[100];
		int m;
		int[] B = new int[100];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			B[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				B[i] = 60;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						A[j] = Integer.parseInt(tempVar3);
					}
				}
				if (A[0] >= 60)
				{
					B[i] = 60;
				}
				else if (A[m - 1] + 3 * m <= 60)
				{
					B[i] = 60 - 3 * m;
				}
				else if (A[m - 1] + 3 * m - 3 <= 60)
				{
					B[i] = A[m - 1];
				}
				else
				{
					for (k = 1;k < m;k++)
					{
						if (A[k] + 3 * k <= 60)
						{
							B[i] = A[k];
						}
						else
						{
							if (A[k - 1] + 3 * k < 60)
							{
								B[i] = 60 - 3 * k;
								break;
							}
							else
							{
							B[i] = A[k - 1];
							break;
							}
						}
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",B[i]);
		}
		return 0;
	}

}

