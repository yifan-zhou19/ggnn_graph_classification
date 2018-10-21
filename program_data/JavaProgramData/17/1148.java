import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[101]); //label???????
		String label = new String(new char[101]);
		int[] pos = new int[101]; //pos???????????

		while (line = new Scanner(System.in).nextLine())
		{
			int left = 0; //?????????
			int len = line.length();
			for (int i = 0; i < 100; i++) //???label
			{
					label = tangible.StringFunctions.changeCharacter(label, i, ' ');
			}
			for (int i = 0; line.charAt(i) != '\0'; i++)
			{
				if (line.charAt(i) == '(') //???????????
				{
					left++;
					pos[left] = i;
				}

				if (line.charAt(i) == ')')
				{
					if (left == 0) //????????????????
					{
						label = tangible.StringFunctions.changeCharacter(label, i, '?'); //?????????
					}
					else
					{
						left--; //???????????????
					}
				}
			}

			for (int i = 1; i <= left; i++)
			{
				label = tangible.StringFunctions.changeCharacter(label, pos[i], '$'); //??????????�$�
			}

			label = tangible.StringFunctions.changeCharacter(label, len, '\0'); //???????
			System.out.print(line);
			System.out.print("\n");
			System.out.print(label);
			System.out.print("\n");
		}

		return 0;
	}

}

