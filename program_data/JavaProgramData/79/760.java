package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int fun(int m, int[] a, int n, int * p)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int i;
		if (n == 1)
		{
			return (a[0]);
		}
		else
		{
			p = p - 1;
			for (i = 1;i <= m;i++)
			{
				if (p == a + n - 1)
				{
					p = a;
				}
				else
				{
					p++;
				}
			}
			for (q = p;q < a + n - 1;q++)
			{
				*q = (q + 1);
			}
			return (fun(m, a, n - 1, p));
		}
	}
	public static void Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int count;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] a = new int[1000];
		for (i = 0;;i++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0)
			{
				break;
			}
		}
		count = i - 1;
		for (i = 0;i <= count;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				a[j] = j + 1;
			}
			p = a;
			System.out.printf("%d\n",fun(m[i], a, n[i], p));
		}
	}

}

