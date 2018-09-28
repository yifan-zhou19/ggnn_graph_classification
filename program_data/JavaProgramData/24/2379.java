import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[600]);
		s = new Scanner(System.in).nextLine();
		int l = 0;
		int i = 0;
		int j;
		int max = 0;
		int min = 10;
		int mm;
		l = s.length();
		s = tangible.StringFunctions.changeCharacter(s, l, ' ');
		s = tangible.StringFunctions.changeCharacter(s, l + 1, '\0');
		while (s.charAt(i) != '\0')
		{
			j = i;
			while (s.charAt(j) != ',' && s.charAt(j) != ' ')
			{
				j++;
			}
			if (j - i > max)
			{
				max = j - i;
				mm = i;
			}
			i++;
		}
		for (i = mm; i < mm + max; i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.print("\n");
		i = 0;
		while (s.charAt(i) != '\0')
		{
			if (i > 0)
			{
				if (s.charAt(i - 1) == ' ' || s.charAt(i - 1) == ',')
				{
					;
				}
				else
				{
					i++;
					continue;
				}
			}
			j = i;
			while (s.charAt(j) != ',' && s.charAt(j) != ' ')
			{
				j++;
			}
			if (j - i < min && j - i != 0)
			{
				min = j - i;
				mm = i;
			}
			i++;
		}
		for (i = mm; i < mm + min; i++)
		{
			System.out.print(s.charAt(i));
		}
		return 0;
	}
}

