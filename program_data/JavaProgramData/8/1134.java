package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int m;
		int n;
		void read(int a[],int n);
		void sort(int a[],int n);
		void print(int a[],int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		read(a, m);
		read(b, n);
		sort(a, m);
		sort(b, n);
		print(a, m);
		System.out.print(" ");
		print(b, n);
	}
	public static void read(int[] a, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
	}
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void print(int[] a, int n)
	{
			int i;
		for (i = 0;;i++)
		{
				System.out.printf("%d",a[i]);
			 n--;
			 if (n != 0)
			 {
				 System.out.print(" ");
			 }
			 else
			 {
				 break;
			 }
		}
	}

}

