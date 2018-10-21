package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int f(int i,int t)
	{
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (i < t)
		 {
			f(i + 1, t);
		 } //??????????????????
		 if (i == 1)
		 {
			 System.out.print(a[i]);
		 }
		 else
		 {
			 System.out.print(a[i]);
			 System.out.print(' ');
		 }
	}
	public static int Main()
	{
		 int t;
		 int i = 1;
		 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 f(i, t);
		 return 0;
	}

}

