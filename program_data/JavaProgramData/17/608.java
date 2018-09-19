import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * match (.cpp
	 *??:????????
	 *  Created on: 2012-12-1
	 *      Author: ???
	 */



	public static String sign = new String(new char[101]); //????,??
	public static int[] lf = new int[100]; //????lf,??(???
	public static int[] rt = new int[100]; //????rt,??)???
	public static int len; //??????

	public static void match()
	{
		int i = 0; //(,)???
		int j = 0;
		int n1 = 0;
		int n2 = 0;
		String result = new String(new char[len]);
		   for (i = 0;i < len;i++)
		   {
			   result = tangible.StringFunctions.changeCharacter(result, i, ' '); //???
		   }
		for (i = 0;i < len;i++) //??(,)???
		{
			if (sign.charAt(i) == '(')
			{
				lf[n1] = i;
				n1++;
			}
			if (sign.charAt(i) == ')')
			{
				rt[n2] = i;
				n2++;
			}
		}
		for (i = n1 - 1;i >= 0;i--) //??????
		{
			for (j = 0;j < n2;j++)
			{
			if (lf[i] < rt[j])
			{
				lf[i] = -1;
				rt[j] = -1;
				break;
			}
			}
		}
		for (i = 0;i < n1;i++) //?????
		{
			if (lf[i] >= 0)
			{
				result = tangible.StringFunctions.changeCharacter(result, lf[i], '$');
			}
		}
		for (j = 0;j < n2;j++)
		{
			if (rt[j] >= 0)
			{
				result = tangible.StringFunctions.changeCharacter(result, rt[j], '?');
			}
		}
		for (i = 0;i < len;i++) //??
		{
			System.out.print(result.charAt(i));
		}
			System.out.print("\n");
	}

	public static int Main()
	{
		while (sign = new Scanner(System.in).nextLine())
		{
		len = sign.length(); //???
		System.out.print(sign);
		System.out.print("\n");
		int i = 0;
		for (i = 0;i < 100;i++) //???
		{
			lf[i] = -1;
			rt[i] = -1;
		}
		match(); //????match
		}
		return 0;
	}
}

