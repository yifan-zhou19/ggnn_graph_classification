import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int n;
		n = a.length();
		int flag = 0;
		int i;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
							   flag = 0;
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			if ((a.charAt(i) == ' ') && (flag == 0))
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
				flag = 1;
			}
			else
			{
				continue;
			}
		}
		int m;
		m = j;
		for (j = 0;j < m;j++)
		{
			System.out.print(b.charAt(j));
		}
		return 0;
	}
}

