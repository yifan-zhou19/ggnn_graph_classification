package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void paixu(int * a,int * b,int c);
		void max(int * a,int * b,int n);
		int[][] a = new int[1001][1001];
		int[][] b = new int[1001][1001];
		int[] c = new int[1001];
		int i = 0;
		int e;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * s;
		s = c;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		leap:
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		if (*s != 0)
		{
			for (j = (a + i);j < *(a + i) + *s;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			}
			for (j = (b + i);j < *(b + i) + *s;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			}
			i++;
			s++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto leap;
		}
		for (e = 0;e < i;e++)
		{
		paixu(*(a + e), *(b + e), c[e]);
		}
		for (e = 0;e < i;e++)
		{
		max(*(a + e), *(b + e), c[e]);
		}
	}
	public static void max(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b, int n)
	{
		int i;
		int j;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *r;
		int r;
		int[] d = new int[1001];
		r = d;
		for (i = 0;i < n;i++)
		{
			int s = 0;
			int t = 0;
			for (j = 0;j < n - i;j++)
			{
				if (*(a.argValue + j) > *(b.argValue + j + i))
				{
				s++;
				}
				else
				{
					if (*(a.argValue + j) == *(b.argValue + j + i))
					{
					t++;
					}
				}
			}
			for (j = 0;j < i;j++)
			{
				if (*(a.argValue + n - i + j) > *(b.argValue + j))
				{
				s++;
				}
				else
				{
					if (*(a.argValue + n - i + j) == *(b.argValue + j))
					{
					t++;
					}
				}
			}
			*(r + i) = 200 * s - 200 * (n - t - s);
		}
		r = d;
		m = r;
		for (r = d + 1;r < n + d;r++)
		{
			if (r > m)
			{
			m = r;
			}
		}
		System.out.printf("%d",m);
		System.out.print("\n");
	}
	public static void paixu(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b, int c)
	{
		int g;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * d;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * f;
		for (d = a.argValue;d < a.argValue + c - 1;d++)
		{
			for (f = d + 1;f < a.argValue + c;f++)
			{
				if (*f > *d)
				{
					g = d;
					*d = f;
					*f = g;
				}
			}
		}
		for (d = b.argValue;d < b.argValue + c - 1;d++)
		{
			for (f = d + 1;f < b.argValue + c;f++)
			{
				if (*f > *d)
				{
					g = d;
					*d = f;
					*f = g;
				}
			}
		}
	}
}

