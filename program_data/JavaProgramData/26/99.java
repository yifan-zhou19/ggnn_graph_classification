import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]); //????????...
		a = new Scanner(System.in).nextLine();
		int na;
		int i;
		int j;
		for (i = 0;i <= 100;i++) //??????????
		{
			if (a.charAt(i) == '\0')
			{
				na = i;
			}
		}
		for (i = 0;i <= na;i++) //??????...
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i;j <= na - 1;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				na = na - 1;
				i = i - 1;

			}
		}

		System.out.print(a);
		return 0;
	}


}

