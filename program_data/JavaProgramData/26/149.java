import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[100]);
	  String tru = new String(new char[100]);
	  int i;
	  int j;
	  int t;
	  int counter;
	  str = new Scanner(System.in).nextLine();
	  for (i = 0,t = 0;str.charAt(i) != '\0';i++,t++)
	  {
		if (str.charAt(i) != ' ')
		{
			tru = tangible.StringFunctions.changeCharacter(tru, t, str.charAt(i));
		}
		else
		{
			counter = 0;
			if (str.charAt(i + 1) != ' ')
			{
				tru = tangible.StringFunctions.changeCharacter(tru, t, str.charAt(i));
			}
			else
			{
				for (j = i;str.charAt(j) == ' ';j++)
				{
				  counter++;
				}
				tru = tangible.StringFunctions.changeCharacter(tru, t, str.charAt(i));
				i = i + counter - 1;
			}
		}
	  }
	  tru = tangible.StringFunctions.changeCharacter(tru, t, '\0');
	  System.out.print(tru);
	}
}

