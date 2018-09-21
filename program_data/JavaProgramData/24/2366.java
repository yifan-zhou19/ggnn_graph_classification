import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[20000]);
		int longlen = 0;
		int shortlen = 201;
		int t = 0;
		int i = 0;
		int[] j = new int[2];
		int k = 0;
		word = new Scanner(System.in).nextLine();
		while (word.charAt(i) != '\0')
		{
			while (word.charAt(i) != ' ' && word.charAt(i) != ',' && word.charAt(i) != '\0')
			{
				t++;
				i++;
			}
			if (t > longlen)
			{
				longlen = t;
				j[0] = i;
			}
			if (t < shortlen)
			{
				shortlen = t;
				j[1] = i;
			}
			while (word.charAt(i) == ' ' || word.charAt(i) == ',')
			{
				i++;
				t = 0;
			}
		}
		for (i = j[0] - longlen; ; i++)
		{
			if (word.charAt(i) == ' ' || word.charAt(i) == ',' || word.charAt(i) == '\0')
			{
				break;
			}
			System.out.print(word.charAt(i));
		}
		System.out.print("\n");
		for (i = j[1] - shortlen;; i++)
		{
			if (word.charAt(i) == ' ' || word.charAt(i) == ',' || word.charAt(i) == '\0')
			{
				break;
			}
			System.out.print(word.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}
