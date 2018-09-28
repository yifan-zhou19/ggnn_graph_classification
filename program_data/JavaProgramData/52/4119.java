package <missing>;

public class GlobalMembers
{
	/*
	 * move.cpp
	 * Author: ???
	 * Created on: 2011-1-8
	 * ?????????
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0; //??????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = 0;
		int n;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		q = a + n; //p?????????q??????????
		for (i = 0;i < n - m;i++)
		{
			*(q++) = *(p++);
		} //??n-m?????????
		p = a + n - m;
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((p++));
			System.out.print(" ");
		} //???n-m+1????????????
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}


}

