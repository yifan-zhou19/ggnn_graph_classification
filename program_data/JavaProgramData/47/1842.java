package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3;
	public static int p3;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p2 = a; n--; ++p2) //??n??????*p2?????
		{
			*p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p3 = p2;
		for (p1 = a, --p2; p1 < p2; ++p1, --p2) //*p1??*p2???????
		{
			n = p1;
			*p1 = p2;
			*p2 = n;
		}
		System.out.print(a);
		for (p1 = a + 1; p1 < p3; ++p1)
		{
			System.out.print(" ");
			System.out.print(p1);
		}
		return 0;
	}

}

