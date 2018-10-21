package <missing>;

public class GlobalMembers
{
	public static int know(int[][] a, int n, int i, int j)
	{
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		return ((a[(i % n) >> 5][j % n] & (1 << ((i % n) & 0x1f))) != 0) ? 1 : 0;
	}

	public static void set(int[][] a, int n, int i, int j)
	{
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		a[(i % n) >> 5][j % n] |= 1 << ((i % n) & 0x1f);
	}

	public static int[][] read_data(int n)
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		int[][] a = (int)malloc(n * sizeof(int) / 32);
		for (i = 0; i < n / 32; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a[i], 0, (n * (Integer.SIZE / Byte.SIZE)));
		}
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				i = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			set(a, n, i, j);
		}
		return a;
	}

	public static void free_data(int[][] a, int n)
	{
		int i;
		for (i = 0; i < n / 32; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int next;
		int k;
		int wrong;
		int candidate;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = read_data(n);
		/*
		for (i = 0; i < n; i++) 
		{
			for (j = 0; j < n; j++) 
			{
				printf("%d", know(a, n, i, j));
			}
			printf("\n");
		}
		*/
		// begin
		i = 0;
		j = 1;
		next = 2;
		while (next <= n)
		{
			if (know(a, n, i, j) != 0)
			{
				i = next;
			}
			else
			{
				j = next;
			}
			next++;
		}
		if (i == n)
		{
			candidate = j;
		}
		else
		{
			candidate = i;
		}
		wrong = 0;
		k = 0;
		while (wrong == 0 && k < n)
		{
			if (know(a, n, candidate, k) != 0 && (candidate != k))
			{
				wrong = 1;
			}
			if (know(a, n, k, candidate) == 0 && (candidate != k))
			{
				wrong = 1;
			}
			k++;
		}
		if (wrong == 0)
		{
			System.out.printf("%d", candidate);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		// end
		free_data(a, n);
		return 0;
	}

}

