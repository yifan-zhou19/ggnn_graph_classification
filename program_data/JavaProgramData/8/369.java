package <missing>;

public class GlobalMembers
{
	public static void input(int m, int[] a) //??
	{
		 int i;
		 for (i = 0;i < m;i++)
		 {
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void arrange(int m, int[] a) //??
	{
		 int i;
		 int j;
		 int c;
		 for (i = 1;i < m;i++)
		 {
		   for (j = 0;j < m - i;j++)
		   {
			 if (a[j] > a[j + 1])
			 {
			   c = a[j];
			   a[j] = a[j + 1];
			   a[j + 1] = c;
			 }
		   }
		 }
	}
	public static void puttogether(int a, int b, int[][] m) //??
	{
		  int i;
		  for (i = 0;i < b;i++)
		  {
		  m[0][a + i] = m[1][i];
		  }
	}
	public static void output(int a, int[] m) //??
	{
		 int i;
		 System.out.print(m[0]);
		 for (i = 1;i < a;i++)
		 {
		 System.out.print(" ");
		 System.out.print(m[i]);
		 }
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] number = new int[2][100];
		input(a, number[0]);
		input(b, number[1]);
		arrange(a, number[0]);
		arrange(b, number[1]);
		puttogether(a, b, number);
		output(a + b, number[0]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

