import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String temp = new String(new char[1000000]);
	public static char a;
	public static char b;

	public static void find()
	{
		int i;
		int index_1;
		int index_2;
		for (i = 0; temp.charAt(i) != '\0'; i++)
		{
			if (temp.charAt(i) == b)
			{
				index_1 = i;
				temp = tangible.StringFunctions.changeCharacter(temp, i, ' ');
				break;
			}
		}
		if (temp.charAt(i) == '\0')
		{
			return;
		}

		for (i = index_1; ;i--)
		{
			if (temp.charAt(i) == a)
			{
				index_2 = i;
				temp [i] = ' ';
				break;
			}
		}
		System.out.print(index_2);
		System.out.print(' ');
		System.out.print(index_1);
		System.out.print("\n");
		find();
		return;
	}

	public static int Main()
	{
		temp = new Scanner(System.in).nextLine();
		a = temp.charAt(0);
		b = temp.charAt(temp.length() - 1);
		find();

		return 0;
	}


}

