import java.util.*;

package <missing>;

public class GlobalMembers
{
	//

	public static int Main()
	{
		String sentence = new String(new char[2000]);
		String longist = new String(new char[40]);
		String shortist = new String(new char[20]);
		int longnum = 0;
		int shortnum = 200;
		int thisnum = 0;
		int i = 0;
		int l = 0;
		int s = 0;
		sentence = new Scanner(System.in).nextLine();
		do
		{
			thisnum = 0;
			while (sentence.charAt(i) != ',' && sentence.charAt(i) != ' ' && sentence.charAt(i) != '\0')
			{
				thisnum++;
				i++;
			}
			if (thisnum > longnum)
			{
				longnum = thisnum;
				l = i - thisnum;
			}
			if (thisnum < shortnum)
			{
				s = i - thisnum;
				shortnum = thisnum;
			}
			while (sentence.charAt(i) == ' ' || sentence.charAt(i) == ',')
			{
				i++;
			}
		}while (sentence.charAt(i) != '\0');
		for (i = l; i < l + longnum; i++)
		{
			System.out.print(sentence.charAt(i));
		}
		System.out.print("\n");
		for (i = s; i < s + shortnum; i++)
		{
			System.out.print(sentence.charAt(i));
		}
		return 0;
	}
}
