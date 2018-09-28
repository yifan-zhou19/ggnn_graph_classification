import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[101]);
		char boy;
		char girl;
		int[] dui = new int[101];
		int i = 1;
		int j;
		input = new Scanner(System.in).nextLine();
		boy = input.charAt(0);
		while (input.charAt(i) == boy)
		{
			i++;
		}
		girl = input.charAt(i);
		for (i = 0;input.charAt(i) != 0;i++)
		{
			if (input.charAt(i) == boy)
			{
				dui[i] = 1;
			}
			if (input.charAt(i) == girl)
			{
				dui[i] = 2;
			}
		}
		for (i = 0;dui[i] != 0;i++)
		{
			if (dui[i] == 2)
			{
				for (j = i - 1;dui[j] != 1;j--)
				{
					;
				}
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				dui[j] = 0;
				dui[i] = 0;
			}
		}
		return 0;
	}
}
