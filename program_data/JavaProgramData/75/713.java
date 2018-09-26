package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????
	//*??? ?? 1300012814  **
	//*???2013.10,30  **
	//********************************
	public static int Main()
	{
		 int[] a = new int[1000];
		 int[] b = new int[1000];
		 int num = 1;
		 int rs = 0;
		 char c;

		 a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 c = System.in.read();
		 while (c == ',')
		 {
		 a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 num++;
			 c = System.in.read();
		 }
		 b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 c = System.in.read();
		 int i = 1;
		 while (c == ',')
		 {
		 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 i++;
			 c = System.in.read();
		 }
		 for (int i = 0;i < 1000;i++)
		 {
			 int n = 0;
		 for (int j = 0; j < num; j++)
		 {
			 if (a[j] <= i != 0 && b[j] > i)
			 {
				 n++;
			 }
		 }
		 if (n > rs)
		 {
			 rs = n;
		 }
		 }
		 System.out.print(num);
		 System.out.print(" ");
		 System.out.print(rs);
		 System.out.print("\n");

		 return 0;
	}
}

