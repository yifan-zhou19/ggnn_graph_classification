import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int num = 0;
		String a = new String(new char[1000]);
		char temp;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		a = tangible.StringFunctions.changeCharacter(a, l, '\t');
		a = tangible.StringFunctions.changeCharacter(a, l + 1, '\0');
		temp = a.charAt(0);
		for (i = 0; a.charAt(i) != '\0';)
		{
			if (a.charAt(i) == temp || a.charAt(i) + 32 == temp || a.charAt(i) - 32 == temp)
			{
				i++;
				num++;
			}
			else
			{
				if (temp < 97)
				{
					System.out.print("(");
					System.out.print(temp);
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print((char)(temp - 32));
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				}
				temp = a.charAt(i);
				num = 0;
			}
		}
		return 0;
	}
}

