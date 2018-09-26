package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int n1;
	public static int n2;
	public static void get(int[] a, int[] b)
	{
		 int i;
		 n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n1;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i < n2;i++)
		 {
			 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void sort(int[] a, int[] b)
	{
		 int i;
		 int j;
		 int temp;
		 for (i = 0;i < n1;i++)
		 {
			 for (j = i;j < n1;j++)
			 {
				 if (a[i] > a[j])
				 {
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
		 }
		 for (i = 0;i < n2;i++)
		 {
			 for (j = i;j < n2;j++)
			 {
				 if (b[i] > b[j])
				 {
					 temp = b[i];
					 b[i] = b[j];
					 b[j] = temp;
				 }
			 }
		 }
	}
	public static void combine(int[] a, int[] b)
	{
		 int i;
		 for (i = 0;i < n2;i++)
		 {
			 a[i + n1] = b[i];
		 }
	}
	public static void print(int[] a, int[] b)
	{
		 int i;
		 for (i = 0;i < n1 + n2 - 1;i++)
		 {
			 System.out.print(a[i]);
			 System.out.print(" ");
		 }
		 System.out.print(a[n1 + n2 - 1]);
	}
	public static int Main()
	{
		get(a, b);
		sort(a, b);
		combine(a, b);
		print(a, b);
		return 0;
	}

}

