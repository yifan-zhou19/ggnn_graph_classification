import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String buf = new String(new char[1000]);
		String key = new String(new char[100]);
		String temp = new String(new char[100]);
		String rep = new String(new char[100]);
		int i;
		int j;
		int n;
		int w;
		buf = new Scanner(System.in).nextLine();
		key = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = 0;
		w = 0;
		while (true)
		{
			for (j = 0;buf.charAt(i) != ' ' && buf.charAt(i) != 0;j++, i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, buf.charAt(i));
			}
			temp = temp.substring(0, j);
			n = strcmp(temp,key);
			if (w != 0)
			{
					System.out.print(' ');
			}
			if (n == 0)
			{

				System.out.print(rep);
			}
			else
			{
				System.out.print(temp);
			}
			w++;
			if (buf.charAt(i) == 0)
			{
				break;
			}
			i++;
		}
		System.out.print("\n");
		return 0;
	}

}

