package <missing>;

public class GlobalMembers
{
	public static int comp(Object elem1, Object elem2)
	{
		if ((int)elem1 < (int)elem2)
		{
			return 1;
		}
		if ((int)elem1 > (int)elem2)
		{
			return -1;
		}
		if ((int)elem1 == (int)elem2)
		{
			return 0;
		}
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  for (i = 0;;i++)
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
			int[] tj = new int[n];
			int[] qww = new int[n];
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tj[j] = Integer.parseInt(tempVar2);
			}
			}
			   qsort(tj,n,(Integer.SIZE / Byte.SIZE),comp);
			for (j = 0;j < n;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qww[j] = Integer.parseInt(tempVar3);
			}
			}
			   qsort(qww,n,(Integer.SIZE / Byte.SIZE),comp);
		   j = 0;
			int s = 0;
		   int k = n - 1;
			for (i = 0; i < n && j <= k;)
			{
				if (tj[j] < qww[i])
				{
					s--;
					k--;
					i++;
				}
				else if (tj[j] == qww[i])
				{
					if (tj[k] < qww[n - 1])
					{
						s--;
						i++;
						k--;
					}
					else if (tj[k] > qww[n - 1])
					{
						s++;
						n--;
						k--;
					}
					else if (tj[k] == qww[n - 1])
					{
						if (tj[k] != qww[i])
						{
							s--;
							i++;
							k--;
						}
						else
						{
							break;
						}
					}
				}
				else
				{
					s++;
					i++;
					j++;
				}
			}
			System.out.printf("%d\n", s * 200);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(tj);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(qww);
		  }
	}

}

