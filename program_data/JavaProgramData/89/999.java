package <missing>;

public class GlobalMembers
{
	/**
	 * @file    1.cpp              
	 * @author  ??? 1100013230               
	 * @date    2011-12-7     
	 * @descrption        
	 *          ??????:??????
	*/
	public static int Main()
	{
		int[] flag1 = new int[10000];
		int[] flag2 = new int[10000];
		int a;
		int b;
		int n;
		int flag = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 0 || b != 0) // ?????0 0?????
		{
			flag1[a]++; // a??????1
			flag2[b]++; // ??a????1
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			if (flag1[i] == 0 && flag2[i] == n - 1) // ?i??????0???i????n - 1??i?????
			{
				System.out.print(i);
				flag = 1; // flag???????????
			}
		}
		if (flag == 0) // ?????????"NOT FOUND"
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

