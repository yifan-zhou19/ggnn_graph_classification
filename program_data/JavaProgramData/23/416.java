import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] space = new int[100];
		int num = 1;
		str = new Scanner(System.in).nextLine();
		space[0] = str.length();
		str = tangible.StringFunctions.changeCharacter(str, space[0], ' ');
		for (int i = space[0] - 1; i >= 0; i--)
		{
			if (str.charAt(i) == ' ')
			{
				for (int j = i + 1; j <= space[num - 1]; j++)
				{
					System.out.print(str.charAt(j));
				}
				space[num++] = i;
			}
		}
		for (int k = 0; k < space[num - 1]; k++)
		{
			System.out.print(str.charAt(k));
		}
		return 0;
	}

}

