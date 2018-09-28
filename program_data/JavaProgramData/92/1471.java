package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int S;
		int t;
		int q;
		int te;
		int qe;
		int m;
		for (;;)
		{
		S = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *T=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int T = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *Q=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int Q = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				T + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				Q + i = Integer.parseInt(tempVar3);
			}
		}

		/*for(i=0;i<n;i++) printf("%3d ", *(T+i));
		printf("\n");
		for(i=0;i<n;i++) printf("%3d ", *(Q+i));
		printf("\n");
		printf("\n");*/

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (*(T + j) > *(T + i))
				{
					m = (T + i);
					*(T + i) = *(T + j);
					*(T + j) = m;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (*(Q + j) > *(Q + i))
				{
					m = (Q + i);
					*(Q + i) = *(Q + j);
					*(Q + j) = m;
				}
			}
		}

		/*for(i=0;i<n;i++) printf("%3d ", *(T+i));
		printf("\n");
		for(i=0;i<n;i++) printf("%3d ", *(Q+i));
		printf("\n");
		printf("\n");*/

		for (t = 0,q = 0,te = n - 1,qe = n - 1;;)
		{
			if (t == te)
			{
				if (*(T + t) > *(Q + q))
				{
				S += 200;
				*(T + t) = -1;
				*(Q + q) = -1;
				t++;
				q++;
				break;
				}
				else if (*(T + t) < *(Q + q))
				{
				S -= 200;
				*(T + te) = -1;
				*(Q + q) = -1;
				q++;
				te--;
				break;
				}
				else if (*(T + t) == *(Q + q))
				{
					break;
				}
			}
			else
			{
			if (*(T + t) > *(Q + q))
			{
				S += 200;
				*(T + t) = -1;
				*(Q + q) = -1;
				t++;
				q++;

		/*for(i=0;i<n;i++) printf("%3d ", *(T+i));
		printf("\n");
		for(i=0;i<n;i++) printf("%3d ", *(Q+i));
		printf("\n");
		printf("%d\n",S);
		printf("\n");*/

			}
			else if (*(T + t) < *(Q + q))
			{
				S -= 200;
				*(T + te) = -1;
				*(Q + q) = -1;
				q++;
				te--;

		/*for(i=0;i<n;i++) printf("%3d ", *(T+i));
		printf("\n");
		for(i=0;i<n;i++) printf("%3d ", *(Q+i));
		printf("\n");
		printf("%d\n",S);
		printf("\n");*/
			}
			else if (*(T + t) == *(Q + q))
			{
				if (*(T + te) > *(Q + qe))
				{
					S += 200;
					*(T + te) = -1;
					*(Q + qe) = -1;
					te--;
					qe--;

		/*for(i=0;i<n;i++) printf("%3d ", *(T+i));
		printf("\n");
		for(i=0;i<n;i++) printf("%3d ", *(Q+i));
		printf("\n");
		printf("%d\n",S);
		printf("\n");*/

				}
				else if (*(T + te) <= *(Q + qe))
				{
					if (*(T + te) != *(T + t))
					{
						S -= 200;
					}
					*(T + te) = -1;
					*(Q + q) = -1;
					q++;
					te--;

		/*for(i=0;i<n;i++) printf("%3d ", *(T+i));
		printf("\n");
		for(i=0;i<n;i++) printf("%3d ", *(Q+i));
		printf("\n");
		printf("%d\n",S);
		printf("\n");*/

				}
			}
			}
		}
		System.out.printf("%d\n",S);
		}
		return 0;
	}
}

