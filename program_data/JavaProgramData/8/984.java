package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void read(int x[],int y[],int a,int b);
		void change(int x[],int y[],int a,int b);
		void combine(int x[],int y[],int a,int b);
		int[] x = new int[10];
		int[] y = new int[10];
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		read(x, y, a, b);
		change(x, y, a, b);
		combine(x, y, a, b);
	}
	public static void read(int[] x, int[] y, int a, int b)
	{
		int i;
		char c;
		for (i = 1;i <= a;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= b;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
	}
	public static void change(int[] x, int[] y, int a, int b)
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= a;i++)
		{
			for (j = 1;j < a + 1 - i;j++)
			{
				if (x[j] > x[j + 1])
				{
					t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= b;i++)
		{
			for (j = 1;j < b + 1 - i;j++)
			{
				if (y[j] > y[j + 1])
				{
					t = y[j];
					y[j] = y[j + 1];
					y[j + 1] = t;
				}
			}
		}
	}
	public static void combine(int[] x, int[] y, int a, int b)
	{
		int i;
		System.out.printf("%d",x[1]);
		for (i = 2;i <= a;i++)
		{
			System.out.printf(" %d",x[i]);
		}
		for (i = 1;i <= b;i++)
		{
			System.out.printf(" %d",y[i]);
		}
	}

}

