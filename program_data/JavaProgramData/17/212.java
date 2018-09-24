import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int deal()
	{
		int i;
		int j;
		for (i = 0;ori.charAt(i) != '\0';i++)
		{
			if (ori.charAt(i) == '(')
			{
				out[i] = 1;
			}
			else if (ori.charAt(i) == ')')
			{
				out[i] = 2;
			}
			else
			{
				out[i] = 0;
			}
		}
		for (i = 0;ori.charAt(i) != '\0';i++)
		{
			if (out[i] == 2)
			{
				for (j = i;j >= 0;j--)
				{
					if (out[j] == 1)
					{
						out[i] = 0;
						out[j] = 0;
						break;
					}
				}
			}
		}
		return 0;
	}
	public static final String ori = "\0";
	public static int[] out = new int[101];
	public static int Main()
	{
		int i;
		while (ori = new Scanner(System.in).nextLine())
		{
			deal();
			System.out.print(ori);
			System.out.print("\n");
			for (i = 0;ori.charAt(i) != '\0';i++)
			{
				if (out[i] == 1)
				{
					System.out.print('$');
				}
				else if (out[i] == 2)
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}
