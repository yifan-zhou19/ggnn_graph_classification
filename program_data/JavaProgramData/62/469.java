import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[101]);
		char[][] a = new char[101][101];
		b = new Scanner(System.in).nextLine();
		a[0][0] = b.charAt(0);
		int k = 1;
		int i = 0;
		int j = 1;
		while (b.charAt(k) != '\0')
		{
			if (b.charAt(k) != ' ')
			{
				a[i][j++] = b.charAt(k);
			}
			else
			{
				if (b.charAt(k) == ' ' && b.charAt(k + 1) != ' ')
				{
						a[i][j] = '\0';
						i++;
						j = 0;
				}
			}
			k++;
		}
		int t;
		for (t = 0;t < i;t++)
		{
			System.out.print(a[t]);
			System.out.print(" ");
		}
		System.out.print(a[i]);
		System.out.print("\n");
		return 0;
	}
}
