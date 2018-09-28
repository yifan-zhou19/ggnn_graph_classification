import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * extractnum.cpp
	 *
	 *  Created on: 2011/12/25
	 *      Author: guyu
	 */
	public static String b = new String(new char[31]);
	public static float[] remembernum = new float[31];
	public static char[][] num = new char[31][31];
	public static void modify(String a, int len) //delete all the blanks
	{
			int i = 0;
			int j = 0;
			for (i = 0;i < len;i++)
			{
				if (a[i].equals(' '))
				{
					for (j = i;j < len;j++)
					{
						a[j] = a[j + 1];
					}
				}
			}
	}
	public static void converse(String a, int len)
	{
			int i = 0;
			int j = 0;
			for (i = 0;i < len;i++)
			{
				if (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0)
				{
					for (j = i;j < len;j++)
					{
						if (a[j].compareTo('0') < 0 || a[j].compareTo('9') > 0)
						{
								System.out.print("\n");
								break;
						}
						else
						{
							System.out.print(a[j]);
						}
					}
					i = j;
				}
			}
	}
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int len;
		int len1;
		len = a.length();
		modify(a, len);
		len1 = a.length();
		converse(a, len1);
		return 0;
	}
}
