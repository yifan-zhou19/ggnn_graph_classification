import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n;
		int i;
		int j;
		int p;
		int[][] b = new int[100][81];
		char[][] a = new char[100][81]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
				a[i] = new Scanner(System.in).nextLine(); //??
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				b[i][j] = a[i][j]; //b[i][j]???a[i][j]?ascii?
			}
		}
		for (i = 0;i < n;i++)
		{
			if (!(b[i][0] == '_' || (b[i][0] >= 'a' && b[i][0] <= 'z') || (b[i][0] >= 'A' && b[i][0] <= 'Z'))) //????????
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			p = 1; //??
			for (j = 1;j < String.valueOf(a[i]).length();j++)
			{
				if (!(b[i][j] == '_' || (b[i][j] >= 'a' && b[i][j] <= 'z') || (b[i][j] >= 'A' && b[i][j] <= 'Z') || (b[i][j] >= '0' && b[i][j] <= '9'))) //????????
				{
					p = 0; //??
					break;
				}
			}
				System.out.print(p);
				System.out.print("\n");
		}
		return 0;
	} //?????
}

