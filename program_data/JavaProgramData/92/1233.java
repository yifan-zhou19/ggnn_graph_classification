package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int n;
		int k1;
		int k2;
		int m1;
		int m2;
		int win;
		int i;
		int w;
		 int[] c = new int[10000];
		for (;;)
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
			int[] a;
			a = new int[n];
			for (i = 0;i < n;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			}
			int[] b;
			b = new int[n];
			for (i = 0;i < n;i++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);
			win = 0;
			k1 = 0;
			k2 = 0;
			m1 = n - 1;
			m2 = n - 1;
			while (k1 <= m1)
			{
				if (a[m1] > b[m2])
				{
				  win++;
			   m1--;
			   m2--;
				}
			 else if (a[k1] > b[k2])
			 {
				 win++;
			  k1++;
			  k2++;
			 }
			 else if (a[m1] < b[k2])
			 {
						win--;
			   m1--;
			   k2++;
			 }
			 else
			 {
					 break;
			 }
			}
			 System.out.printf("%d\n",200 * win);
		}


	}

}

