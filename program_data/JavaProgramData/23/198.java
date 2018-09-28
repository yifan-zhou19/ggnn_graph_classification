import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int h = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if (a.charAt(i) != '\0')
			{
				k++;
			}
		}
		for (i = k;i >= 0;i--)
		{
			if (a.charAt(i) != ' ')
			{
				continue;
			}
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;;j++)
				{
					if (a.charAt(j) == ' ' || a.charAt(j) == '\0')
					{
						b = tangible.StringFunctions.changeCharacter(b, h++, ' ');
						break;
					}
					b = tangible.StringFunctions.changeCharacter(b, h++, a.charAt(j));

				}
			}
		}
		for (i = 0;;i++)
		{
			if (a.charAt(i) == ' ' || a.charAt(i) == '\0')
			{

						break;
			}
			b = tangible.StringFunctions.changeCharacter(b, h++, a.charAt(i));
		}
		b = tangible.StringFunctions.changeCharacter(b, h, '\0');

		System.out.print(b);
		System.out.print("\n");
		return 0;
	}
}

