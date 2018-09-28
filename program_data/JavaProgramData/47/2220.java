package <missing>;

public class GlobalMembers
{
	public static int[] A = new int[100]; //??????:??A????,????n,????i
	public static int n;
	public static int i = 0;
	public static void change() //?????????,?????
	{
		 A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 i++;
		 if (i < n)
		 {
			change();
		 }
		 i--;
		 if (i != 0)
		 {
			System.out.print(A[i]);
			System.out.print(" ");
		 }
		 else
		 {
			System.out.print(A[i]);
		 }
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		change(); //????change
		return 0;
	}
}

