package <missing>;

public class GlobalMembers
{
	/*
	  Name: ????
	  Author: chenminhuan(1200012757)
	  Date: 10/12/12 
	*/

	public static final int maxN = 1000;
	public static int Main()
	{
		int[] a = new int[maxN];
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0,p = a; i < n ;++i, ++p) //??????n??
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (p = a, q = a + n - 1; p < q; ++p,--q) //??????????
		{
			swap(*p, *q); //??????
		}

		System.out.print(a[0]);
		for (p = a + 1, i = 1; i < n ;++i, ++p) //?????
		{
			System.out.print(" ");
			System.out.print(p);
		}

		return 0;
	}
}

