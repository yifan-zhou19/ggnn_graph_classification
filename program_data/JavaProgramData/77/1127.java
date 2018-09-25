import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String xiao = new String(new char[101]);
	public static int k = 0;
	public static void zhao(int length) //????
	{
		int i;
		int j;
		int n;
		int m;
		for (i = 1; i < length; i++)
		{
			if (xiao.charAt(i) == ')') //??????????
			{
				m = i;
				xiao = tangible.StringFunctions.changeCharacter(xiao, i, '.');
				k = k + 2;
				break;
			}
		}
		for (j = m - 1; j >= 0; j--) //??????????????
		{
			if (xiao.charAt(j) == '(')
			{
				n = j;
				xiao = tangible.StringFunctions.changeCharacter(xiao, j, '.');
				break;
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(m);
		System.out.print("\n");
		if (k < length)
		{
			zhao(length);
		}
	}
	public static int Main()
	{
		int length;
		int i;
		xiao = new Scanner(System.in).nextLine(); //?????
		length = xiao.length();
		for (i = 1; i < length; i++)
		{
			if (xiao.charAt(i) == xiao.charAt(0))
			{
				xiao = tangible.StringFunctions.changeCharacter(xiao, i, '('); //????????
			}
			else
			{
				xiao = tangible.StringFunctions.changeCharacter(xiao, i, ')');
			}
		}
		xiao = tangible.StringFunctions.changeCharacter(xiao, 0, '(');
		zhao(length); //????
		return 0;
	}


}

