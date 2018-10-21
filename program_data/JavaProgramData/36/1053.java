package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int i;
		int l;
		int k;
		int[] a = new int[200];
		String s1 = new String(new char[200]);
		String s2 = new String(new char[200]);
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s1.length();
		k = s2.length();
		if (k != l)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < l;i++)
		{
			a[s1.charAt(i)]++;
		}
		for (i = 0;i < k;i++)
		{
			a[s2.charAt(i)]--;
		}
		for (i = 1;i < 130;i++)
		{
			if (a[i] != 0)
			{

				System.out.print("NO");
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("YES");
		System.out.print("\n");
		return 0;
	}
}

