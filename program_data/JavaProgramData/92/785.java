package <missing>;

public class GlobalMembers
{
	public static int comp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		int[] w = new int[1500];
		int[] t = new int[1500];
		int[] wsymb = new int[1500];
		int[] tsymb = new int[1500];
		int n;
		int i;
		int j;
		int tot;

		while (scanf("%d", n), n)
		{
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					w[i] = Integer.parseInt(tempVar2);
				}
			}

			qsort(w, n, (Integer.SIZE / Byte.SIZE), comp);
			qsort(t, n, (Integer.SIZE / Byte.SIZE), comp);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(wsymb, 0, n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(tsymb, 0, n * (Integer.SIZE / Byte.SIZE));
			tot = 0;

			for (i = 0; i < n; i++)
			{
				for (j = n - 1; j >= 0 && (wsymb[j] != 0 || w[j] >= t[i]); j--)
				{
					;
				}
				if (j < 0)
				{
					continue;
				}
				wsymb[j] = tsymb[i] = 1;
				tot++;
			}

			for (i = j = 0; i < n; i++)
			{
				if (wsymb[i] != 0)
				{
					continue;
				}
				while (j < n && (tsymb[j] != 0 || w[i] > t[j]))
				{
					j++;
				}
				if (j == n)
				{
					break;
				}
				if (w[i] == t[j])
				{
					wsymb[i] = tsymb[j++] = 1;
				}
			}
			for (i = 0; i < n; i++)
			{
				if (wsymb[i] == 0)
				{
					tot--;
				}
			}

			System.out.printf("%d\n", tot * 200);
		}

		return 0;
	}

}

