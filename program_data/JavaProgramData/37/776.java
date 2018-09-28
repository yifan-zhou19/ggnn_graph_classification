import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	int[][] t = new int[100][26];
	int s;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	int i;
	int j = 0;
	char[][] a = new char[100][10001];
	for (i = 0;i < 100;i++)
	{
	for (j = 0;j < 26;j++)
	{
		t[i][j] = 0;
	}
	}
	for (i = 0;i < 100;i++)
	{
	for (j = 0;j < 10001;j++)
	{
		a[i][j] = '\0';
	}
	}
	for (i = 0;i < n;i++)
	{
		a[i] = new Scanner(System.in).nextLine();
	}
	for (i = 0;i < n;i++)
	{
		j = 0;
					while (a[i][j] != '\0')
					{
						s = a[i][j] - 97;
					t[i][s]++;
					j++;
					}

	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 10001;j++)
		{
		if (a[i][j] == '\0')
		{
		System.out.print("no");
		System.out.print("\n");
	break;
		}
	else
	{
							if (t[i][(int)(a[i][j] - 97)] == 1)
							{
		System.out.print(a[i][j]);
		System.out.print("\n");
	break;
							}
	}
		}


	}
	return 0;
	}
}

