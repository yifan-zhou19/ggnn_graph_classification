import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:4.cpp                                        *
	//*  ??????    1200012948                             *
	//*  ????: 2012 11 13                                *
	//*  ????:????                                                                                               *
	//********************************************************
	//??
	public static int Main()
	{
		String a = new String(new char[500]);
		int l;
		int i;
		int j;
		int m = 0;
		int h;
		int e;
		int k;
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length(); //???????
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j + i <= l; j++)
			{
				flag = 0;
				h = j;
				e = j + i - 1;
				while (a.charAt(h) == a.charAt(e))
				{
					if (flag == 0)
					{
						 m = h; //m????
						 flag = 1;
					}
				  //????????

					h++;
					e--;
					if (h >= e)
					{
						break;
					}
				}
				if (h >= e)
				{
					 for (k = m; k <= m + i - 1; k++)
					 {
						  System.out.print(a.charAt(k));
					 }
					 System.out.print("\n");
				}
			}

		}
		return 0;
	}

}
