package <missing>;

public class GlobalMembers
{
	public static int check(int n, int[] a, int[] b)
	{
		int i;
		int j;
		int x;
		int y;
		int[] k;
		k = new int[n];
		for (j = 0;j < n;j++)
		{
			k[j] = 0;
			x = a[0];
			for (i = 0;i < n;i++)
			{
				a[i] = a[i + 1];
			}
			a[n - 1] = x;
			for (i = 0;i < n;i++)
			{
			  if (a[i] > b[i])
			  {
				  k[j]++;
			  }
			  if (a[i] < b[i])
			  {
				  k[j]--;
			  }
			}
		}
		x = 0;
		y = k[0];
		for (j = 1;j < n;j++)
		{
		  if (k[j] > y)
		  {
			  x = j;
		  y = k[j];
		  }
		}
		return y;
	}
	public static int com(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)e1;
		p2 = (int)e2;
		return (p1 - p2);
	}
	public static int Main()
	{
		int s;
		for (s = 0;;s++)
		{
			int n;
			int[] a;
			int[] b;
			int i;
			int m;
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
				a = new int[n];
			b = new int[n];
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),com);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),com);
			m = 200 * (check(n, a, b));
			System.out.printf("%d\n",m);
			}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

