package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  LZW_Work
	//
	//  Created by LZW on 9/28/12.
	//
	//



	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int i;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - 1; ; i--)
		{
			if (i == 0)
			{
				System.out.print(a[0]);
				break;
			}
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}

}

