import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int b;
		b = a.length();
		int i = 0;
		int j;
		while (i < b)
		{
			if (a.charAt(i) > '9' || a.charAt(i) < '0')
			{
				i++;
				continue;
			}

		for (j = i;(a.charAt(j) <= '9') && (a.charAt(j) >= '0');j++)
		{
			System.out.print(a.charAt(j));
		}
		System.out.print("\n");
		i = j + 1;
		}
		return 0;
	}

}
