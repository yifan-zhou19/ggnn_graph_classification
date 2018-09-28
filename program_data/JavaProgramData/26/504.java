import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		for (int i = 0; i < l; i++)
		{
				if (a.charAt(i) != ' ')
				{
				System.out.print(a.charAt(i));
				}
				else
				{
					System.out.print(' ');
					while (true)
					{
						if (a.charAt(i + 1) != ' ')
						{
							System.out.print(a.charAt(i + 1));
							i = i + 1;
							break;
						}
						else
						{
							i++;
							continue;
						}
					}
				}
		}
				return 0;
	}

}
