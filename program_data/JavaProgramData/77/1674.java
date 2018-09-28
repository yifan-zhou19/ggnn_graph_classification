import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void print(String str)
	{
		int[] stack = new int[100];
		int i;
		int j = 0;
		int la;
		la = str.length();
		for (i = 0;i < la;i++)
		{
			if (str[i].equals(str[0]))
			{
				stack[j++] = i;
			}
			else if (!str[i].equals(str[0]))
			{
				System.out.print(stack[j - 1]);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
				j--;
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		print(str);
		return 0;
	}

}
