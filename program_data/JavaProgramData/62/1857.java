import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String chsentence = new String(new char[100000]);
		String chnew = new String(new char[100000]);
		int i;
		int j;
		int nlen;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(chsentence, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(chnew, 0, (Character.SIZE / Byte.SIZE));
		chsentence = new Scanner(System.in).nextLine();
		for (i = 0, j = 0; chsentence.charAt(i) != '\0'; i++)
		{
			if (chsentence.charAt(i) != ' ')
			{
				chnew = tangible.StringFunctions.changeCharacter(chnew, j, chsentence.charAt(i));
				j++;
			}
			else if (chsentence.charAt(i) == ' ')
			{
				if (chsentence.charAt(i - 1) == ' ')
				{
					continue;
				}
				else
				{
					chnew = tangible.StringFunctions.changeCharacter(chnew, j, chsentence.charAt(i));
					j++;
				}
			}

		}
		nlen = chnew.length();
		for (i = 0; i < nlen; i++)
		{
			System.out.print(chnew.charAt(i));
		}
		return 0;
	}
}

