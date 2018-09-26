package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		p2 = (int)elem2;
		return (p2) - p1;
	}
	public static int Main()
	{
		int i;
		for (i = 0;;i++)
		{
			int n;
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
			int[] a = new int[n];
			int[] b = new int[n];
			int j;
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
			}
			int k;
			for (k = 0;k < n;k++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[k] = Integer.parseInt(tempVar3);
			}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),Compare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),Compare);
			 j = 0;
			 k = 0;
			int p = 0;
			int q = 0;
			int t = 0;
			int tailt = n - 1;
			int tailq = n - 1;
			for (;(p + q + t) != n;)
			{
				if (a[j] > b[k])
				{
					t++;
					j++;
					k++;
				}
				else if (a[j] < b[k])
				{
					tailt--;
					k++;
					q++;
				}
				else if (a[j] == b[k])
				{
					if (a[tailt] > b[tailq])
					{
						t++;
						tailt--;
						tailq--;
					}
					else if (a[tailt] == b[tailq])
					{
						if (a[tailt] == b[k])
						{
							p++;
							tailt--;
							k++;
						}
						else
						{
							q++;
							tailt--;
							k++;
						}
					}
					else if (a[tailt] < b[tailq])
					{
						q++;
						tailt--;
						k++;
					}
				}
			}
			int profit;
			if (t == q)
			{
			System.out.print("0\n");
			}
			else if (t > q)
			{
				profit = 200 * (t - q);
				System.out.printf("%d\n",profit);
			}
			else if (t < q)
			{
				profit = 200 * (q - t);
				System.out.printf("-%d\n",profit);
			}
			}
		}
	}

}

