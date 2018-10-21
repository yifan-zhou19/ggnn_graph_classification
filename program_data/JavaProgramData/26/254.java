import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String p;
		int i;
		int count;
		a = new Scanner(System.in).nextLine();
		count = 0;
		for (p = a; * p != '\0'; p++)
		{
			if (p == a)
			{
				continue;
			}
			if (*p == ' ')
			{
				count++;
			}
			if (*p != ' ' && *(p - 1) == ' ')
			{
				count = count - 1;
				for (p = p - count, i = 0; ; i++)
				{
					p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i + count));
					if (p.charAt(i) == '\0')
					{
						break;
					}
				}
				count = 0;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

