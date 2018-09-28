import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:2.cpp                                        *
	//*  ??????    1200012948                          *
	//*  ????: 2012 12 24                                *
	//*  ????:????                                   *
	//********************************************************
	public static int Main()
	{
		int len1;
		int len2;
		int len3;
		int i;
		int j;
		int m;
		int p;
		int flag = 0;
		String str1 = new String(new char[300]);
		String str2 = new String(new char[50]);
		String str3 = new String(new char[50]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		len3 = str3.length();
		for (i = 0; i <= len1 - len2; i++)
		{
			flag = 0;
			m = i;
			for (j = 0; j < len2; j++)
			{
				if (str1.charAt(m++) != str2.charAt(j))
				{
					break;
				}
			}
			if (j == len2) //????????
			{
				for (p = 0; p < i; p++)
				{
					System.out.print(str1.charAt(p));
				}
				System.out.print(str3);
				System.out.print(str1.Substring(i) + len2);
				System.out.print("\n");
				flag = 1; //????
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print(str1);
			System.out.print("\n");
		}
		return 0;
	}

}
