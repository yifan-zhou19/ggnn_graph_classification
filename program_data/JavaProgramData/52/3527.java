package <missing>;

public class GlobalMembers
{
	/**
	 *???3.cpp
	 *??????
	 *???????
	 *???12?10?
	 */
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[102];
		int[] p = a;
		for (;p < a + n;p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??????
		int temp;
		for (int i = 0;i < m;i++) //??m???
		{
			for (p = a + n - m + i;p > a + i;p--) //?m????????
			{
				temp = p[0];
				p[0] = (p - 1);
				*(p - 1) = temp;
			}
			p = a; //????a???
		}
		for (;p < a + n - 1;p++) //????
		{
			System.out.print(p);
			System.out.print(' ');
		}
		System.out.print(p);
		System.out.print("\n");
	return 0;
	}
}

