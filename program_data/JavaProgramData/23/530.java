import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k;
		int t = 0;
		int pan = 0;
		char[][] a = new char[201][100];
		String b = new String(new char[100]);
		b = new Scanner(System.in).nextLine();
		while (b.charAt(j) != '\0')
		{
			while (b.charAt(j) != ' ')
			{
				a[i][t] = b.charAt(j);
				j++;
				t++;
				if (b.charAt(j) == '\0')
				{
					pan = 1;
					break;
				}
			}
			if (pan == 1)
			{
				break;
			}
			i++;
			j++;
			t = 0;
		}
		for (k = i;k > 0;k--)
		{
			j = 0;
			while (a[k][j] != '\0')
			{
				System.out.print(a[k][j]);
				j++;
			}
			System.out.print(' ');
		}
		j = 0;
		while (a[0][j] != '\0')
		{
			System.out.print(a[0][j]);
			j++;
		}
	}
}
