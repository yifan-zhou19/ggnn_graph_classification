import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void check(String a, int i, int j)
	{
		int k;
		int m = 0;
		for (k = 0; k <= i / 2; k++)
		{
			if (!a[j + k].equals(a[j + i - 1 - k]))
			{
				m = 1;
				break;
			}
		}
		if (m != 1)
		{
			for (k = 0; k < i; k++)
			{
				System.out.print(a[j + k]);
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		String a = new String(new char[500]);
		int n;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		i = 0;
		while (a.charAt(i) != '\0')
		{
			i++;
		}
		n = i;
		for (i = 2; i <= n; i++)
		{
			for (j = 0; j <= n - i; j++)
			{
				check(a, i, j);
			}
		}
		return 0;
	}
}
