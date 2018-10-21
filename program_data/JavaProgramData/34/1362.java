package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogucaixiang.cpp
	 *
	 *  Created on: 2012-11-20
	 *      Author: AK
	 */
	public static int jiaogu(int a)
	{ //??????
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		} //?????1??return 0????
		else if (a % 2 == 1)
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(3 * a + 1);
			System.out.print("\n");
			return jiaogu(3 * a + 1);
		} //???????????????
		else
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(a / 2);
			System.out.print("\n");
			return (jiaogu(a / 2));
		} //???????????????
		return 0; //??
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = jiaogu(a);
		return 0;
	}

}

