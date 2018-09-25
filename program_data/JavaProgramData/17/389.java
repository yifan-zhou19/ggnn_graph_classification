import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void check()
	{
		String array = new String(new char[103]);
		while (ConsoleInput.lastReadWasGood())
		{ //?????
		array = new Scanner(System.in).nextLine(); //?????
		int i;
		int j;
		int len;
		len = array.length(); //????
		for (i = 0;i < len;i++)
		{
			System.out.print(array.charAt(i));
		}
		System.out.print("\n");
		for (i = 0;i < len;i++)
		{ //?????????
			if (array.charAt(i) == ')')
			{ //?????
				for (j = i - 1;j >= 0;j--)
				{ //????????
					if (array.charAt(j) == '(')
					{ //???
						array = tangible.StringFunctions.changeCharacter(array, j, '1'); //??????
						array = tangible.StringFunctions.changeCharacter(array, i, '1'); //??????
						break; //????
					}
				}
			}
		}
		for (i = 0;i < len;i++)
		{ //????????
			if (array.charAt(i) != '(' && array.charAt(i) != ')')
			{
				System.out.print(' ');
			}
			if (array.charAt(i) == '(')
			{
				System.out.print('$');
			}
			if (array.charAt(i) == ')')
			{
				System.out.print('?');
			}
		}
		System.out.print("\n");
		}
		return;
	}

	public static int Main()
	{
		check(); //??check??
		return 0;
	}

}

