import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0; i <= a.length() - 1; i++)
		{
			if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
			{
				System.out.print((a.Substring(i)));
			}
			else
			{
				System.out.print("\n");
				while (*(a.Substring(i)) < '0' || *(a.Substring(i)) > '9')
				{
					i++;
				}
				i--;
			}
		}
		return 0;
	}
}
