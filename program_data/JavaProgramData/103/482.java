import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1010]);
		int i;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
			for (i = 0;str.charAt(i) != '\0';i++)
			{
			   char t = str.charAt(i);
			   int count = 1;
				while (str.charAt(i + 1) == t)
				{
					i = i + 1;
					count++;
				}
			   System.out.print('(');
			   System.out.print(t);
			   System.out.print(',');
			   System.out.print(count);
			   System.out.print(')');

			}
			return 0;


	}

}

