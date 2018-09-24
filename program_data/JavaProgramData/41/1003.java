package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[5];
		int[] D = new int[5];
		int[] E = {1, 4, 5};
		int i;
		int j;
		int k;
		int l;
		int m;
		int i1;
		int j1;
		int k1;
		int l1;
		int m1;
		for (i = 0;i <= 4;i++)
		{
			A[i] = i + 1;
			if (i == 4)
			{
			k1 = 1;
			}
			else
			{
			k1 = 0;
			}
			{
				for (j = 0;j <= 4;j++)
				{
					B[j] = j + 1;
					if (A[i] == B[j])
					{
						continue;
					}
					if (j == 1)
					{
					j1 = 1;
					}
					else
					{
					j1 = 0;
					}
					for (k = 0;k <= 4;k++)
					{
						C[k] = k + 1;
						if (A[i] == C[k] || B[j] == C[k])
						{
							continue;
						}
						if (k != 0)
						{
						l1 = 1;
						}
						else
						{
						l1 = 0;
						}
						for (l = 0;l <= 4;l++)
						{
							D[l] = l + 1;
							if (A[i] == D[l] || B[j] == D[l] || C[k] == D[l])
							{
								continue;
							}
							if (l == 0)
							{
							m1 = 1;
							}
							else
							{
							m1 = 0;
							}
							for (m = 0;m <= 2;m++)
							{
								if (A[i] == E[m] || B[j] == E[m] || C[k] == E[m] || D[l] == E[m])
								{
									continue;
								}
								i1 + j1 + l1 + m1 + k1 == 2;
								if (A[i] == 5 && B[j] == 2 && C[k] == 1 && D[l] == 3 && E[m] == 4)
								{
								System.out.print(A[i]);
								System.out.print(" ");
								System.out.print(B[j]);
								System.out.print(" ");
								System.out.print(C[k]);
								System.out.print(" ");
								System.out.print(D[l]);
								System.out.print(" ");
								System.out.print(E[m]);
								System.out.print("\n");
								break;
								}
							}
						}
					}
				}
		}
		}
								return 0;
	}

}
