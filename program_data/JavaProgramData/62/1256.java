import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: delete blank.cpp
	 *??????
	 *????: 2012-12-10
	 *??: ??????
	 */


	public static int Main()
	{
		String sentence = new String(new char[1000]);
		//????
		sentence = new Scanner(System.in).nextLine();
		for (int i = 0; i <= sentence.length(); i++)
		{
			if (*(sentence.Substring(i)) == ' ')
			{
				int j;
				for (j = i; ; j++)
				{
					if (*(sentence.Substring(j) + 1) != ' ')
					{
						break;
					}
				}
				for (int k = 0; k <= sentence.length() - i + 1; k++)
				{
					*(sentence.Substring(k) + i) = *(sentence.Substring(j) + k);
				}
			}
		}
		System.out.print(sentence);
		return 0;
	}
}
