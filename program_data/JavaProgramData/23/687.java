import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int l = 0;
		l = a.length();

		a = tangible.StringFunctions.changeCharacter(a, l, ' ');
		int[] n = new int[51];
		int k = 1;
		for (int i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ')
			{
					n[k] = i;
			k++;
			}
		}

		n[k] = l;
		n[0] = -1;
		for (int i = k;i > 1;i--)
		{
			for (int j = n[i - 1] + 1;j <= n[i];j++)
			{
				System.out.print(a.charAt(j));

			}
		}
		for (int j = 0;j < n[1];j++)
		{
			System.out.print(a.charAt(j));
		}
		return 0;
	}
}

