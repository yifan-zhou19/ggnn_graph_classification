import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String an = new String(new char[100]);
		an = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		String bn = new String(new char[100]);
		int n = 0;
		for (i = 0;i < an.length();)
		{
			if (an.charAt(i) >= '0' && an.charAt(i) <= '9')
			{
				bn = tangible.StringFunctions.changeCharacter(bn, j, an.charAt(i));
				i++;
				j++;
				while (an.charAt(i) >= '0' && an.charAt(i) <= '9')
				{
					bn = tangible.StringFunctions.changeCharacter(bn, j, an.charAt(i));
					j++;
					i++;
				}
				bn = tangible.StringFunctions.changeCharacter(bn, j, ' ');
				j++;
				i++;
				n++;
			}
			else
			{
				i++;
			}
		}

		for (int k = 0;k < j - 1;k++)
		{
			if (bn.charAt(k) == ' ')
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(bn.charAt(k));
			}
		}
		return 0;
	}




}

