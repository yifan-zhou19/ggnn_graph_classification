import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c; //a??????????sign??????????
		final String a = "";
		final String sign = "";
		int length;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(0) != '\0')
		{
			length = a.length();
			System.out.print(a);
			System.out.print("\n");
			for (i = 0;i < length;i++)
			{
				if (a.charAt(i) != ')') //???????????????????
				{
					continue;
				}
				else if (i > 0)
				{
					j = i - 1;
					while (j >= 0 && a.charAt(j) != '(') //??????????
					{
						j--;
					}
					if (a.charAt(j) == '(')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '\0');
						a = tangible.StringFunctions.changeCharacter(a, j, '\0');
					}
				}
			}
			for (i = 0;i < length;i++) //???????????
			{
				if (a.charAt(i) == '(')
				{
					sign = tangible.StringFunctions.changeCharacter(sign, i, '$');
				}
				else
				{
					if (a.charAt(i) == ')')
					{
						sign = tangible.StringFunctions.changeCharacter(sign, i, '?');
					}
					else
					{
						sign = tangible.StringFunctions.changeCharacter(sign, i, ' ');
					}
				}
			}
			System.out.print(sign);
			for (i = 0;i < 105;i++) //a???sign?????
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				sign = tangible.StringFunctions.changeCharacter(sign, i, '\0');
			}
			a = new Scanner(System.in).nextLine(); //??????????????????a???�\0�???????
			if (a.charAt(0) != '\0')
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

