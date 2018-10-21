package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 * ?????
	 * ????: 2012-12-9
	 * ?????????
	 */
	public static int Main()
	{ //?????
		int[] a = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		int n = 0;
		int i = 0;
		; //??????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????
		p = a[n - 1]; //???p????a???????
		for (i = n - 1;i >= 1;i--)
		{
			System.out.print(p);
			System.out.print(" ");
			p--;
		} //?????n-1?
		System.out.print(p);
		System.out.print("\n");
		return 0;
	} //?????
}

