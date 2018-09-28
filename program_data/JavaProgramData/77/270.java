import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String queue = new String(new char[100]);
		queue = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 1;i < queue.length();i++)
		{
			if (queue.charAt(i) != queue.charAt(0))
			{
				queue = tangible.StringFunctions.changeCharacter(queue, i, ')');
			}
			if (queue.charAt(i) == queue.charAt(0))
			{
				queue = tangible.StringFunctions.changeCharacter(queue, i, '(');
			}
		}
		queue = tangible.StringFunctions.changeCharacter(queue, 0, '(');
		for (i = 0;i < queue.length();i++)
		{
			if (queue.charAt(i) == ')')
			{
				j = i - 1;
				while ((queue.charAt(j) == '*') && (j > 0))
				{
					j = j - 1;
				}
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				queue = tangible.StringFunctions.changeCharacter(queue, j, '*');
				queue = tangible.StringFunctions.changeCharacter(queue, i, '*');
			}
		}
		return 0;
	}
}

