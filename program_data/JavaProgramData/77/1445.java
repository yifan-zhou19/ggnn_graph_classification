import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char char1;
		char char2;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		char1 = a.charAt(0);
		for (i = 0; i < 100; i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				char2 = a.charAt(i);
				break;
			}
		}
		i = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == char2)
			{
				for (j = i; j >= 0; j--)
				{
					if (a.charAt(j) == char1)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						break;
					}
				}
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				a = tangible.StringFunctions.changeCharacter(a, j, ' ');
			}
			i++;
		}
		return 0;
	}
}

