package <missing>;

public class GlobalMembers
{
	/*
	 * hs.2.cpp
	 *
	 *  Created on: 2010-11-22
	 *      Author: l
	 */
	public static int jd(int x)
	{
		if (x == 1)
		{
		return 1;
		}
	else
	{
			if (x % 2 != 0)
			{

			return (x - 1) / 2;
			}
		else
		{
			return x / 2;
		}
	}
	} //????jd???x???x?????
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int lx = 1;
		int ly = 1;
		int s;
		int t;
		int p = 0;
		int i;
		int j;
		s = x;
		for (lx = 1;;lx++)
		{
			if (s != 1)
			{
			s = jd(s);
			}
		else
		{
			break;
		}
		} //??x???????
		t = y;
	for (ly = 1;;ly++)
	{
		if (t != 1)
		{
			t = jd(t);
		}
		else
		{
			break; //??y???????
		}
	}

	s = x;
	t = y;
		for (i = 1;i <= lx;i++)
		{
			t = y;
			for (j = 1;j <= ly;j++)
			{
				if (s == t)
				{
					p = 1;
					System.out.print(t);
					System.out.print("\n");
		break;
				}
			else
			{
				t = jd(t);
			}
			}
			if (p != 0)
			{
				break;
			}
		s = jd(s);
		} //?????????????????????????????



		return 0;
	}

}

