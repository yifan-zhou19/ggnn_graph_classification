import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		int n = c.length();
		int i = 0;
		do
		{
			if (c.charAt(i) != ' ')
			{
					System.out.print(c.charAt(i));
					//cout << i << endl ;
					i++;
			}
			else
			{
				System.out.print(c.charAt(i));
				do
				{
					 i = i + 1;
				}while (c.charAt(i) == ' ');
			}
		}while (i <= n - 1);
		System.out.print("\n");
		return 0;
	}
}
