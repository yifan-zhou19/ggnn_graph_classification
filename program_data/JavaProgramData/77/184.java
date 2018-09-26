import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void paidui(String str)
	{
		int i = 0;
		int k = 0;
		for (i = 1;i < str.length();i++)
		{
			if (!str[i].equals(str[0]))
			{
				for (k = i - 1;k >= 0;k--)
				{
					if (str[k].equals(str[0]))
					{
						System.out.print(k);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");


					str[k] = ' ';
					str[i] = ' ';
					break;
					}


				}
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		paidui(str);
		return 0;
	}


}
