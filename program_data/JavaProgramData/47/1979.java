package <missing>;

public class GlobalMembers
{
	/*
	 * ????reverse.cpp
	 * ?????1200012840
	 * ?????2012-12-13
	 * ????????????????????????????8,6,5,4,1?????1,4,5,6,8?
	 */



	public static int Main()
	{
		int n; //????
		int i;
		int[] a = new int[102];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a,q = a + n - 1;p < q;p++,q--) //??????
		{
			temp = p;
			*p = q;
			*q = temp;
		}
		for (p = a;p < (a + n - 1);p++) //??
		{
			System.out.print(p);
			System.out.print(' ');
		}
		p = a + n - 1;
		System.out.print(p);
		System.out.print("\n");
		return 0; //????
	}

}

