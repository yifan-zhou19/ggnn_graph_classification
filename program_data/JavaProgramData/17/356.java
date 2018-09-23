import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[1000]);
		String st2 = new String(new char[1000]);
		while (st = new Scanner(System.in).nextLine())
		{
		for (int i = 1;i <= st.length();i++)
		{
			st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, ' ');
		}
		st2 = tangible.StringFunctions.changeCharacter(st2, st.length(), '\0');

		int count = 0;
		int[] z = new int[1000];
		for (int i = 1;i <= st.length();i++)
		{
			if (st.charAt(i - 1) == '(')
			{
			count++;
			z[count] = i;
			}
			else if (st.charAt(i - 1) == ')')
			{
				if (count > 0)
				{
					z[count] = 0;
					count--;
				}
				else
				{
					st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, '?');
				}
			}
		}
		for (int i = 1;i <= count;i++)
		{
			st2 = tangible.StringFunctions.changeCharacter(st2, z[i] - 1, '$');
		}
		System.out.print(st);
		System.out.print("\n");
		System.out.print(st2);
		System.out.print("\n");
		}

		return 0;
	}

}

