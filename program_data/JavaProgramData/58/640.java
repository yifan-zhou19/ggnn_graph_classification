import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] mark = new int[1000];
		int k;
		int l;
		int m;
		char[][] a = new char[1000][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0; m < n; m++)
		{
			mark[m] = 1;
		}
		cin.ignore();
		for (i = 0; i < n; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (j = 0; j < n; j++)
		{
			if ((0 > a[j][0] - 'a' || a[j][0] - 'a' > 25) && (0 > a[j][0] - 'A' || a[j][0] - 'A' > 25) && a[j][0] != '_')
			{
				mark[j] = 0;
				continue;
			}
			for (k = 1; k < String.valueOf(a[j]).length(); k++)
			{
				if ((0 > a[j][k] - 'a' || a[j][k] - 'a' > 25) && (0 > a[j][k] - 'A' || a[j][k] - 'A' > 25) && (0 > a[j][k] - '0' || a[j][k] - '0' > 9) && a[j][k] != '_')
				{
					mark[j] = 0;
					break;
				}
			}
		}
		for (l = 0; l < n; l++)
		{
			System.out.print(mark[l]);
			System.out.print("\n");
		}
		return 0;
	}


}

