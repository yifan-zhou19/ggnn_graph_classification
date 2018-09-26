import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int l;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j <= l - i; j++)
			{
				k = j;
				while (a.charAt(k) == a.charAt(2 * j + i - 1 - k) && k < 2 * j + i - 1 - k)
				{
					k++;
				}
				if (k >= 2 * j + i - 1 - k)
				{
					for (k = j; k < j + i; k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
