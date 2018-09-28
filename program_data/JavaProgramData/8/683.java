package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int la;
	public static int lb;
	public static int p;
	public static int[] c = new int[1000];
	public static int lc;

	public static void M1(int m1)
	{
		 la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 1;i <= la;i++)
		 {
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (int i = 1;i <= lb;i++)
		 {
		 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}

	public static void M2(int m2)
	{
		 for (int i = 1;i <= la;i++)
		 {
			 for (int j = 1;j <= la - 1;j++)
			 {
				 if (a[j] > a[j + 1])
				 {
					p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				 }
			 }
		 }
		 for (int i = 1;i <= lb;i++)
		 {
			 for (int j = 1;j <= lb - 1;j++)
			 {
				 if (b[j] > b[j + 1])
				 {
					p = b[j];
					b[j] = b[j + 1];
					b[j + 1] = p;
				 }
			 }
		 }
	}

	public static void M3(int m3)
	{
		 lc = la + lb;
		 for (int i = 1;i <= la;i++)
		 {
		 c[i] = a[i];
		 }
		 for (int i = 1;i <= lb;i++)
		 {
		 c[la + i] = b[i];
		 }
	}

	public static void M4(int m4)
	{
		 for (int i = 1;i <= lc;i++)
		 {
			 System.out.print(c[i]);
			 if (i == lc)
			 {
			 break;
			 }
			 System.out.print(" ");
		 }
	}

	public static int Main()
	{
		M1(1);
		M2(1);
		M3(1);
		M4(1);
		return 0;
	}

}

