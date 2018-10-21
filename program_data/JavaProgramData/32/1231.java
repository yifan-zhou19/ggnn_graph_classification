import java.util.*;

package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   4.cpp                             *
	 *@author ??                              *
	 *@date   2013-11-19                        *
	 *@description                              *
	 *??????8??????                 *
	 ********************************************
	 */
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		int nlen1;
		int nlen2;
		int[] num1 = new int[101];
		int[] num2 = new int[100];
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) // ????
		{
			System.in.read();
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			//?????
			nlen1 = str1.length();
			nlen2 = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, (Integer.SIZE / Byte.SIZE)); // ????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, (Integer.SIZE / Byte.SIZE)); // ????
			q = 0;

			//????
			for (p = nlen1 - 1; p >= 0; p--)
			{
				num1[q++] = str1.charAt(p) - '0';
			}
			q = 0;
			for (p = nlen2 - 1; p >= 0; p--)
			{
				num2[q++] = str2.charAt(p) - '0';
			}

			//???
			for (p = 0; p < 100; p++)
			{
				num1[p] -= num2[p];
				if (num1[p] < 0)
				{
					num1[p] += 10;
					num1[p + 1]--;
				}
			}
			p = 100;

			//??0?
			while (num1[p] == 0)
			{
				p--;
			}

			//????
			for (; p >= 0; p--)
			{
				System.out.print(num1[p]);
			}
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

