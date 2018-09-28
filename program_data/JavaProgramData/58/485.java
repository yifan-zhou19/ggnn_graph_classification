import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char[][] a = new char[100][81];
		int[] flag = new int[100];
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			int num = 0;
			if (((a[i][0] <= 'z') && (a[i][0] >= 'a')) || ((a[i][0] <= 'Z') && (a[i][0] >= 'A')) || (a[i][0] == '_'))
			{
				for (j = 0;a[i][j] != '\0';j++)
				{
					if (((a[i][j] <= 'z') && (a[i][j] >= 'a')) || ((a[i][j] <= 'Z') && (a[i][j] >= 'A')) || ((a[i][j] >= '0') && (a[i][j] <= '9')) || (a[i][j] == '_'))
					{
						num++;
					}
				}
				if (num == j)
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

