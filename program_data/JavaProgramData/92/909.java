package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int saima = new int(int n,int qiwang[1000],int tianji[1000]);
		int n;
		int i;
		int j;
		int[] tianji = new int[1000];
		int[] qiwang = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;n != 0;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tianji[j] = Integer.parseInt(tempVar2);
				}
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qiwang[j] = Integer.parseInt(tempVar3);
				}
			}
			System.out.printf("%d\n",saima(n, qiwang, tianji));
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
	public static int saima(int n, int[] qiwang, int[] tianji)
	{
		void seq(int n,int a[1000]);
		void del(int i, int n, int a[1000]);
		int i;
		int win;
		seq(n, tianji);
		seq(n, qiwang);
		win = 0;
		while (n > 0)
		{
			 if ((tianji[n - 1] != qiwang[n - 1]) && (n > 0))
			 {
				if (tianji[n - 1] > qiwang[n - 1])
				{
					win = win + 200;
					del(n - 1, n, tianji);
					del(n - 1, n, qiwang);
					n = n - 1;
				}
				else
				{
					 win = win - 200;
					 del(n - 1, n, tianji);
					 del(0, n, qiwang);
					 n = n - 1;
				}
			 }
			if ((tianji[0] != qiwang[0]) && (n > 0))
			{
				if (tianji[0] > qiwang[0])
				{
					win = win + 200;
					del(0, n, tianji);
					del(0, n, qiwang);
					n = n - 1;
				}
				else
				{
					 win = win - 200;
					 del(n - 1, n, tianji);
					 del(0, n, qiwang);
					 n = n - 1;
				}
			}
			if ((tianji[0] == qiwang[0]) && (tianji[n - 1] == qiwang[n - 1]) && (n > 0))
			{
				if (tianji[n - 1] < qiwang[0])
				{
					win = win - 200;
				}
				del(n - 1, n, tianji);
				del(0, n, qiwang);
				n = n - 1;
			}

		}
			return (win);
	}
	public static void seq(int n, int[] a)
	{
		   int i;
		   int j;
		   int temp;
		   for (i = 0;i < n;i++)
		   {
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
								 temp = a[j];
								 a[j] = a[j + 1];
								 a[j + 1] = temp;
				}
			}
		   }
	}
	public static void del(int i, int n, int[] a)
	{
		 int j;
		 for (j = i;j < n;j++)
		 {
			 a[j] = a[j + 1];
		 }
	}

}

