package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???1000012846_4.cpp  *****************************
	//*  ??:??  ******************************************
	//*  ?????2010?12?  *******************************
	//*  ?????????  *********************************
	//********************************************************
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = a + n - 1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=a+n-m;
		int q = a + n - m;
		for (i = 0;i < n - m;i++)
		{
			p += 1;
			*p = a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(q);
			System.out.print(" ");
			q += 1;
		}
		System.out.print(q);
		System.out.print("\n");
		return 0;
	}

}

