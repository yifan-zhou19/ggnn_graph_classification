import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[100]);
		int i = 0;
		int j;
		int t;
		st = new Scanner(System.in).nextLine();
		for (i = 0;st.charAt(i) != '\0';i++)
		{
			if (st.charAt(i) == ' ' && st.charAt(i + 1) == ' ')
			{
				for (j = i + 1;st.charAt(j) == ' ';j++)
				{
					for (t = j;st.charAt(t) != '\0';t++)
					{
						st = tangible.StringFunctions.changeCharacter(st, t, st.charAt(t + 1));
					}
					j--;
				}
			}
		}
		for (i = 0;st.charAt(i) != '\0';i++)
		{
			System.out.print(st.charAt(i));
		}
		return 0;
	}
}

