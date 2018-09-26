import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	*8-3
	*??? 1200012851
	*??13
	*2012.11.13
	**/
	public static int Main()
	{
		String str = new String(new char[100]); //??????????str
		int[] result = new int[100]; //??????result
		int i; //??????i,?????len,??r
		int len;
		int r;
		str = new Scanner(System.in).nextLine(); //?????
		len = str.length(); //??????
		if (len == 1) //?????????
		{
			r = str.charAt(0) - '0';
			System.out.print("0");
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		else
		{
			if (len == 2) //?????????
			{
				r = ((str.charAt(0) - '0') * 10 + (str.charAt(1) - '0')) % 13;
				System.out.print(((str.charAt(0) - '0') * 10 + (str.charAt(1) - '0')) / 13);
				System.out.print("\n");
				System.out.print(r);
				System.out.print("\n");
			}
			else //?????????
			{
				r = (str.charAt(0) - '0') * 100 + (str.charAt(1) - '0') * 10 + (str.charAt(2) - '0'); //??????
				result[2] = r / 13;
				r = r % 13;
				System.out.print(result[2]);
				for (i = 3; i < len; i++) //?????????????
				{
					r = (r * 10 + str.charAt(i) - '0');
					result[i] = r / 13;
					r = r % 13;
					System.out.print(result[i]);
				}
				System.out.print("\n");
				System.out.print(r);
				System.out.print("\n");
			}
		}
		return 0;
	}

}
