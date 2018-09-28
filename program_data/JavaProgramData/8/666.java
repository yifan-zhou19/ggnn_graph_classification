package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void inputdata()
	{
		 a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 1;i <= a[0];i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (int i = 1;i <= b[0];i++)
		 {
			 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void outputdata()
	{
		 for (int i = 1;i <= a[0];i++)
		 {
			 System.out.print(a[i]);
			 System.out.print(' ');
		 }
		 for (int i = 1;i < b[0];i++)
		 {
			 System.out.print(b[i]);
			 System.out.print(' ');
		 }
		 System.out.print(b[b[0]]);
	}
	public static void sortdata()
	{
		 sort(a + 1,a + a[0] + 1);
		 sort(b + 1,b + b[0] + 1);
	}

	public static int Main()
	{
		inputdata();
		sortdata();
		outputdata();

		return 0;
	}

}

