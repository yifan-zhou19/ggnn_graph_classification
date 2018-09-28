package <missing>;

public class GlobalMembers
{
	public static int paixu(Object a, Object b)
	{
		return ((int)b - (int)a);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int money = 0;
		int s;
		for (s = 0;s < 50;s++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n > 0)
		 {
		  int[] a = new int[n];
		  int[] b = new int[n];
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
		qsort(a,n, (Integer.SIZE / Byte.SIZE),paixu);
		qsort(b,n, (Integer.SIZE / Byte.SIZE),paixu);
		i = 0;
		j = 0;
		int x;
		int y;
		int t = 0;
		x = n - 1;
		y = n - 1;
		while (t < n)
		{
		 if (a[i] > b[j])
		 {
		   i++;
		   j++;
		   money += 200;
		   t++;
		 }

		else if (a[x] > b[y])
		{
		   x--;
		   y--;
		   money += 200;
		   t++;
		}

		else if (a[x] == b[j])
		{
			 x--;
			 j++;
			 t++;
		}
		else
		{
			money = money - 200;
			x--;
			j++;
			t++;
		}
		}

		System.out.printf("%d\n",money);
		money = 0;
		 }
		}

	  return 0;
	}






}

