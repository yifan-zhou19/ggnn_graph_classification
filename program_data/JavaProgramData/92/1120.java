package <missing>;

public class GlobalMembers
{
	public static int find(int[] a, int i, int j)
	{
		int key = a[i];
		int k;
		int flag = 0;
		for (k = i + 1;k <= j;k++)
		{
			if (a[k] > key)
			{
				return k;
			}
			else if (a[k] < key)
			{
				return i;
			}
		}
		return -1;
	}
	public static int partition(int[] a, int i, int j, int pivot)
	{
		int ta;
		int l = i;
		int r = j;
		do
		{
			ta = a[l];
			a[l] = a[r];
			a[r] = ta;
			while (a[l] >= pivot)
			{
				l++;
			}
			while (a[r] < pivot)
			{
				r--;
			}
		}while (l <= r);
		return l;
	}
	public static void quicksort(int[] a, int i, int j)
	{
		int pindex;
		int pivot;
		int k;
		pindex = find(a, i, j);
		if (pindex >= 0)
		{
			pivot = a[pindex];
			k = partition(a, i, j, pivot);
			quicksort(a, i, k - 1);
			quicksort(a, k, j);
		}
	}

	public static int compare(Object p, Object q)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * t1 = (int*)p;
		int t1 = (int)p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * t2 = (int*)q;
		int t2 = (int)q;
		return t2 - t1;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t_max;
		int t_min;
		int[] q = new int[1000];
		int[] t = new int[1000];
		int win;
		int loss;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				return 0;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(t,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(q,n,(Integer.SIZE / Byte.SIZE),compare);
			t_max = 0;
			t_min = n - 1;
			win = loss = 0;
			for (i = 0;i < n;i++)
			{
				if (t[t_max] > q[i])
				{
					win++;
					t_max++;
				}
				else if (t[t_max] < q[i])
				{
					loss++;
					t_min--;
				}
				else if (t[t_max] == q[i])
				{
					for (j = i + 1,k = t_max + 1;j < n;j++,k++)
					{
						if (t[k] <= q[j] != 0 && t[t_max]> q[j])
						{
							break;
						}
					}
					if (j < n)
					{
						if (t[t_min] < q[i])
						{
							loss++;
						}
						t_min--;
					}
					else
					{
						t_max++;
					}
				}
			}
			System.out.printf("%d\n",200 * (win - loss));
		}
		return 0;
	}
}

