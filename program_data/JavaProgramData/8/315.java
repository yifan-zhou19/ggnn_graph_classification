package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int Main()
	{
		void shuru(int x[],int y[]);
		void paixu(int x[],int y[]);
		void hebin(int x[],int y[]);
		void shuchu(int x[]);
		int[] a = new int[200];
		int[] b = new int[100];
		shuru(a, b);
		paixu(a, b);
		hebin(a, b);
		shuchu(a);
		return 0;
	}
	public static void shuru(int[] x, int[] y) //??????
	{
		 int i;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;i++)
		 {
			 x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i < m;i++)
		 {
			 y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void paixu(int[] x, int[] y) //??
	{
		 int i;
		 int j;
		 int temp;
		 for (i = 0;i < n - 1;i++)
		 {
			for (j = i + 1;j < n;j++)
			{
			if (x[i] > x[j])
			{
			temp = x[i];
			x[i] = x[j];
			x[j] = temp;
			}
			}
		 }
		 for (i = 0;i < m - 1;i++)
		 {
			for (j = i + 1;j < m;j++)
			{
			if (y[i] > y[j])
			{
			temp = y[i];
			y[i] = y[j];
			y[j] = temp;
			}
			}
		 }
	}
	public static void hebin(int[] x, int[] y) //??
	{
		 int i;
		 int j;
		 for (i = n,j = 0;i < n + m;i++,j++)
		 {
		   x[i] = y[j];
		 }
	}
	public static void shuchu(int[] x) //??
	{
		 for (int i = 0;i < n + m - 1;i++)
		 {
		 System.out.print(x[i]);
		 System.out.print(' ');
		 }
		 System.out.print(x[n + m - 1]);

	}

}

