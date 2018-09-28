import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[10000]);
		int i;
		int j;
		sentence = new Scanner(System.in).nextLine();
		for (i = 0; i < sentence.length();)
		{
			if (sentence.charAt(i) != ' ')
			{
				System.out.print(sentence.charAt(i));
				i++;
			}
			else
			{
				 do
				 {
					 i++;
				 } while (sentence.charAt(i) == ' ');
				 System.out.print(' ');
			}
		}

		return 0;
	}

}
