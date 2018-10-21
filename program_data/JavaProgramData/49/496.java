import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??:    ????             ** 
	//*??: ???      		    **
	//*???2011  11 15              **
	//****************************************
	public static int i;
	public static int l;
	public static String str = new String(new char[501]); //???????

	public static void f(int num,int len) //????
	{
		if (len <= 0) //?length?????????????
		{
			int j;
			for (j = i ; j < i + l ; j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print("\n");
		}
		else
		{
			if (str.charAt(num) == str.charAt(num + len - 1)) //????????
			{
				f(num + 1, len - 2); //??????
			}
		}
	}

	public static int Main()
	{
		int lenth; //??????
		str = new Scanner(System.in).nextLine(); //??????
		lenth = str.length(); //????????
		for (l = 2 ; l < lenth ; l++)
		{
			for (i = 0 ; i + l - 1 <= lenth ; i++) //??
			{
				f(i, l); //????
			}
		}
		return 0;
	}
}
