package <missing>;

public class GlobalMembers
{
	//
	//  Created by Chu-Pan,Wong on Dec 3, 2013.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//



	public static int[] a = new int[250];
	public static int[] b = new int[250];
	public static String num = new String(new char[251]);

	public static void Main(String[] args)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		int aa = (int)num.length();
		for (int i = 0; i < aa; i++)
		{
			a[i] = num.charAt(aa - 1 - i) - '0';
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		int bb = (int)num.length();
		for (int i = 0; i < bb; i++)
		{
			b[i] = num.charAt(bb - 1 - i) - '0';
		}
		for (int i = 0; i < 250; i++)
		{
			a[i] = a[i] + b[i];
			if (a[i] > 9)
			{
				a[i + 1]++;
				a[i] -= 10;
			}
		}
		for (int i = 0; i < 250; i++)
		{
			if (a[i] > 9)
			{
				a[i + 1]++;
				a[i] -= 10;
			}
		}
		int max = 0;
		for (int i = 249; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				max = i;
				break;
			}
		}
		for (int i = max; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}
}

