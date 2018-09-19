package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n; //n????a?????????????number????
	 int[] a = new int[101];
	 int number;
	 int i;
							  //????????i
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= 100;i++)
	 {
	  a[i] = 0; //???a????0
	 }
	 number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.out.print(number);
	 a[number] = 1;
	 for (i = 1;i <= n - 1;i++)
	 {
	   number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (a[number] == 0) //?a[number]?0????????
	   {
		 a[number] = 1; //?a[number]??1??????
		 System.out.print(" ");
		 System.out.print(number);
	   }
	 }
	 return 0;
	}
}

