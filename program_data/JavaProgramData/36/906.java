import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int count = 0;
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		m = str.length();
		for (k = 0; ; k++)
		{
			if (str.charAt(k) == ' ')
			{
				break;
			}
		}
		for (i = 0; i < k; i++)
		{
			for (j = k + 1; j <= m; j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					str = tangible.StringFunctions.changeCharacter(str, j, '0');
					count++;
					break;
				}
			}
			if (j == 2 * k + 1)
			{
				break;
			}
		}
		if ((i < k) || ((count < k) && (count <= m - k - 1)) || ((count <= k) && (count < m - k - 1)))
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		return 0;
	}

}

