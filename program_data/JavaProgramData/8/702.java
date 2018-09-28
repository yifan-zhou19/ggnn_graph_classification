package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int n;
	public static int m;
	 public static void shuru()
	 {
		 int x;
		 int y;
		 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int i;
		 for (i = 0;i < x;i++)
		 {
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i < y;i++)
		 {
		 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 n = x;
		 m = y;
	 }
		public static void paixu()
		{
			int i;
			int j;
			int t;
			for (i = 0;i < n - 1;i++)
			{
			for (j = i;j < n;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			}
			for (i = 0;i < m - 1;i++)
			{
			for (j = i;j < m;j++)
			{
			   if (b[i] > b[j])
			   {
					t = b[i];
					b[i] = b[j];
					b[j] = t;
			   }
			}
			}
		}
		public static void hebing()
		{
			 int i;
			 for (i = n;i < m + n;i++)
			 {
			 a[i] = b[i - n];
			 }
		}
		public static void shuchu()
		{
			 int i;
			 for (i = 0;i < m + n - 1;i++)
			 {
			 System.out.print(a[i]);
			 System.out.print(" ");
			 }
			 System.out.print(a[m + n - 1]);
		}
	public static int Main()
	{

		shuru();
		paixu();
		hebing();
		shuchu();
		return 0;
	}
}

