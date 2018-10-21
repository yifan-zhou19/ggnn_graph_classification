import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] x = new int[100];
		int p = 0;
		int q = 0;
		char[][] a = new char[100][10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			x[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			p = 0;
			if (a[i][0] == '_' || ((a[i][0] <= 'z') && (a[i][0] >= 'a')) || ((a[i][0] <= 'Z') && (a[i][0] >= 'A')))
			{
				  for (j = 0;j < x[i];j++)
				  {
					if (((a[i][j] < 65) && (a[i][j]>57)) || ((a[i][j] < 95) && (a[i][j]>90)) || (a[i][j] < 48) || (a[i][j]>122) || (a[i][j] == 96) || (a[i][j] == ' '))
					{
					p = 1;
					}
				  }
			}
			else
			{
				p = 1;
			}
			if (p == 0)
			{
			System.out.print(1);
			System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;

	}
}

