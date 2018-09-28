import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char boy;
		char girl;
		final String children = "";
		int sum; //sum???????????
		int i;
		int j;
		children = new Scanner(System.in).nextLine();
		sum = children.length();
		boy = children.charAt(0);
		girl = children.charAt(sum - 1);
		while (children.charAt(sum - 1) != '\0')
		{
			j = 0;
			while (children.charAt(j) != girl && j < sum) //???????????
			{
				j++;
			}
			i = j - 1;
			while (children.charAt(i) != boy && i >= 0) //?????????????????
			{
				i--;
			}
			children = tangible.StringFunctions.changeCharacter(children, i, '\0'); //??????
			children = tangible.StringFunctions.changeCharacter(children, j, '\0');
			if (j == sum - 1) //????????
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
			}
			else
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

