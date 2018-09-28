import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************************************************
	//*  ?????4.cpp                             *
	//*  ?????? 1200012877                     *
	//*  ???2012 ? 11 ? 18 ?                   *
	//*  ?????????                          *
	//************************************************
	public static int Main()
	{
		String win = new String(new char[501]);
		int sum;
		int t = 0;
		win = new Scanner(System.in).nextLine();
		sum = win.length();
		for (int i = 2;i <= 500;i = i + 2)
		{
			for (int j = 0;j < sum;j++)
			{
				if (j + i - 1 > sum)
				{
					break;
				}
				if (win.charAt(j) == win.charAt(j + i - 1))
				{
					t = 0;
					for (int p = 1;p <= (i / 2) - 1;p++)
					{
						if (win.charAt(j + p) == win.charAt(j + i - 1 - p))
						{
							t++;
						}
					}
					if (t == (i / 2) - 1)
					{
						for (int k = j;k <= j + i - 1;k++)
						{
							System.out.print(win.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}
