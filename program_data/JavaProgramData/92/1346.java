package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h;
		int i = 0;
		int j = 0;
		int temp;
		int re;
		int iLAST;
		int jLAST;
		int[] t = new int[1000];
		int[] q = new int[1000];
		for (h = 1;;h++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
			break;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						t + i = tempVar2;
					}
				}
				for (j = 0;j < n;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						q + j = tempVar3;
					}
				}
				for (i = 0;i < n;i++) //&#197;&#197;D��&#239;&#188;�
				{
					for (j = i;j < n;j++)
					{
						if (t[j] < t[i])
						{
							temp = t[j];
							t[j] = t[i];
							t[i] = temp;
						}
					}
				}
				for (i = 0;i < n;i++) //&#197;&#197;D�&#198;&#235;�&#245;
				{
					for (j = i;j < n;j++)
					{
						if (q[j] < q[i])
						{
							temp = q[j];
							q[j] = q[i];
							q[i] = temp;
						}
					}
				}

				re = 0;
				j = 0;
				iLAST = n - 1;
				jLAST = n - 1;
				for (i = 0;i <= iLAST;i++)
				{
					if (t[i] > q[j])
					{
						re++;
					}
					else if (t[i] < q[j])
					{
						re--;
						j--;
						jLAST--;
					}
					else
					{
						for (;;jLAST--)
						{
							if (t[iLAST] > q[jLAST])
							{
								re++;
								iLAST--;
							}
							else if (t[iLAST] < q[jLAST])
							{
								re--;
								j--;
								jLAST--;
								break;
							}
							else
							{
								if (t[i] == t[iLAST])
								{
								break;
								}
								else
								{
									re--;
									j--;
									jLAST--;
									break;
								}
							}
						}
						if (t[i] == t[iLAST] && q[j] == q[jLAST])
						{
						break;
						}
					}
					j++;
				}
				System.out.printf("%d\n",200 * re);
			}
		}

	}

}

