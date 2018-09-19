/*
 * jiegou1.cpp
 *
 *  Created on: 2010-12-24
 *      Author: l
 */

public class student
{
	public int No;
	public int china;
	public int math;
} //????student

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(n); //??n????????st?n???????
		int i;
		for (i = 0;i < n;i++)
		{
			st[i].No = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			st[i].china = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			st[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		int s;
		int a1 = 0; //???????????????
		int a2 = 0;
		int a3 = 0;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		for (i = 0;i < n;i++)
		{
			s = st[i].china + st[i].math;
		if (s > a1)
		{

			a3 = a2;
			b3 = b2;
			a2 = a1;
			b2 = b1;
			a1 = s;
			b1 = i;
			continue; //??????????????
		}

		if (s > a2)
		{

				a3 = a2;
				b3 = b2;
				a2 = s;
							b2 = i;
				continue;

		} //??????????????
		if (s > a3)
		{
				a3 = s;
				b3 = i;
				continue;
		} //?????????????
		}
		System.out.print(st[b1].No);
		System.out.print(" ");
		System.out.print(a1);
		System.out.print("\n");
		System.out.print(st[b2].No);
		System.out.print(" ");
		System.out.print(a2);
		System.out.print("\n");
		System.out.print(st[b3].No);
		System.out.print(" ");
		System.out.print(a3);
		System.out.print("\n");
		return 0;
	}

}

