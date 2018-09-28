import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????????                                    **
	//*?????? 1100012907       **
	//*???2011. 11.15                         **
	//****************************************
	public static int k;
	public static int l;
	public static int i;
	public static int j;
	public static int p;
	public static String str = new String(new char[500]);
	public static void huiwen()
	{
		for (k = 1; k < l; k++) //????2?????????
		{
			for (i = 0; i < l; i++)
			{
				if (str.charAt(i + k) == str.charAt(i)) //????????
				{
					for (p = i + 1; p < i + k; p++)
					{
						if (str.charAt(p) != str.charAt(2 * i + k - p))
						{
							break; //??????????????????
						}
					}
					if (p > (2 * i + k) / 2) //?????????????????
					{
						for (j = i; j <= i + k; j++)
						{
							System.out.print(str.charAt(j));
						}
						System.out.print("\n");
					}
				}
			}
		}
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		l = str.length(); //???????
		huiwen();
		return 0;
	}
}
