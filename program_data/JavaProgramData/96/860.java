package <missing>;

public class GlobalMembers
{
	/*
	 * yuesefuwenti.cpp
	 *
	 *  Created on: 2012-12-8
	 *      Author: wenjun
	 */
	public static int Main()
	{
		String a = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] b = new int[110];
		int x;
		int len;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = a.length();
		for (int i = 0;i < len;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		//for(int i=0;i<len;i++)
			//	cout<<b[i];
		x = 0;
		for (int i = 0;i < len;i++)
		{
			b[i] = 10 * x + b[i];
			x = b[i] % 13;
			b[i] = b[i] / 13;

		}
		int k = 0;
		while (b[k] == 0)
		{
			k++;
		}
		if (k == len)
		{
			System.out.print("0");
		}
		for (int i = k;i < len;i++)
		{
			System.out.print(b[i]);
		}
		System.out.print("\n");
		System.out.print(x);
		System.out.print("\n");
		}
		return 0;
	}

}

