import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*??????
	 *?????function3-4.cpp
	 *Created on: 2012-12-4
	 *?????????
	 */

	public static String input = new String(new char[105]); //??????
	public static String output = new String(new char[105]);

	public static void f()

	{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(output, 0, (Character.SIZE / Byte.SIZE));

		int l = 0;
		int r = 0;

		int len = input.length();

		int i;

		for (i = 0; i < len; ++i)

		{

			output = tangible.StringFunctions.changeCharacter(output, i, ' ');

			if (input.charAt(i) == ')')

			{

				if (l <= 0)
				{

					output = tangible.StringFunctions.changeCharacter(output, i, '?'); //?????�?�??
				}

				else
				{

					l--;
				}

			}

			else if (input.charAt(i) == '(')
			{

				l++;
			}

		}

		l = r = 0;

		for (i = len; i >= 0; --i)

		{

			if (input.charAt(i) == '(')

			{

				if (r <= 0)
				{

					output = tangible.StringFunctions.changeCharacter(output, i, '$'); //?????�?�??
				}

				else
				{

					r--;
				}

			}

			else if (input.charAt(i) == ')')
			{

				r++;
			}

		}

		System.out.print(input);
		System.out.print("\n");

		System.out.print(output);
		System.out.print("\n");

	}
	public static int Main()
	{

		while (input = new Scanner(System.in).nextLine())
		{



			f();

		}

		return 0; //????
	}


}

