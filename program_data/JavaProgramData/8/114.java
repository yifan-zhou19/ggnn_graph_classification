package <missing>;

public class GlobalMembers
{
		public static int[] a = new int[100];
		public static int[] b = new int[100];
		public static int i = 0;
		public static int j = 0;
		public static int I;
		public static int J;

	public static void Main()
	{
		void load(); //a)  ??void load()????????????????????????static??????
		void order(int a[], int b[]); //b)  ??void order(int a[], int b[])??????????????
		void conflate(int a[], int b[]); //c)  ??void conflate(int a[], int b[])???????????b????a??????
		void print(int a[]); //d)  ??void print(int a[])???????????????a????

		load();
		order(a, b);
		conflate(a, b);
		print(a);
	}

	public static void load()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		I = i;
		J = j;
		for (i = 0;i < I;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < J;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void order(int[] a, int[] b)
	{
		void xu(int x[], int y);

		xu(a, I);
		xu(b, J);
	}

	public static void xu(int[] x, int y)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p, *q, *temp,t;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp;
		int temp;
		int t;
		p = x;
		for (i = 0;i < y - 1;i++)
		{
			p = x[i];
			for (j = i + 1;j < y;j++)
			{
				q = x[j];
				if (p > q)
				{
					temp = p;
					p = q;
					q = temp;
				}
			}
			if (p != x[i])
			{
				t = p;
				p = x[i];
				x[i] = t;
			}

		}
	}

	public static void conflate(int[] a, int[] b)
	{
		for (i = I;i < I + J;i++)
		{
			a[i] = b[i - I];
		}
	}

	public static void print(int[] a)
	{
		for (i = 0;i < I + J;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < I + J - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

