package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i = 0;
	 int temp = 0;
	 int[] a = new int[100];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 while ((a[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	 {
	 ;
	 }
	 i = 0;
	 while (i <= (n - 1) / 2)
	 {
	  temp = a[i];
	  a[i] = a[n - 1 - i];
	  a[n - 1 - i] = temp;
	  i++;
	 }
	 System.out.print(a[0]);
	 for (i = 1;i < n;i++)
	 {
		 System.out.print(" ");
		 System.out.print(a[i]);
	 }
	 return 0;
	}
}

