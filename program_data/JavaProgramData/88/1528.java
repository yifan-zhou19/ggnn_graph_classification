import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		int j;
		int count;
		a = new Scanner(System.in).nextLine();
		count = 0;
		for (i = 0; ; i++)
		{
			if (a.charAt(i) == '\0')
			{
				for (j = i - count; j < i; j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print("\n");
				break;
			}
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{
				count++;
			}
			if ((a.charAt(i) > '9' || a.charAt(i) < '0') && (a.charAt(i - 1) <= '9' && a.charAt(i - 1) >= '0'))
			{
				for (j = i - count; j < i; j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print("\n");
				count = 0;
			}
		}
			return 0;
	}
}
