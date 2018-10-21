import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[2000]);
		st = new Scanner(System.in).nextLine();
		for (int i = 1;i <= st.length();i++)
		{
			if ('a' <= st.charAt(i - 1) && st.charAt(i - 1) <= 'z')
			{
				st = tangible.StringFunctions.changeCharacter(st, i - 1, st.charAt(i - 1) - 32);
			}
		}

			  int t = 1;
		for (int i = 2;i <= st.length() + 1;i++)
		{
			if (st.charAt(i - 2) == st.charAt(i - 1))
			{
				t++;
			}
			else
			{
				System.out.printf("(%c,%d)",st.charAt(i - 2),t);
				t = 1;
			}
		}


		return 0;
	}

}

