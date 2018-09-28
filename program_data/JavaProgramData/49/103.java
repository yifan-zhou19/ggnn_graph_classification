import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************************
	//* file: 1000012912_005.cpp                      *
	//* author : ???                               *
	//* date : 2010.11.26                             *
	//* function : ????                           *
	//*************************************************
	public static void huiwen(int pos, int l, String str)
	{
		int right; //left?????right????
		int left;
		int j;
		for (left = pos, right = pos + l - 1; right > left; right--, left++)
		{
			if (!str[left].equals(str[right])) //?????????
			{
				break;
			}
		}
		if (left >= right) //????
		{
			for (j = pos; j < pos + l; j++)
			{
				System.out.print(str[j]);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int i; //l?????
		int len;
		int l;
		String str = new String(new char[500]);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (l = 2; l <= len; l++)
		{
			for (i = 0; i < len; i++) //i?????
			{
				 huiwen(i, l, str);
			}
		}
		return 0;
	}
}
