import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] st = new char[1000][81];
	int n;
	int i = 0;
	int j;
	int k = 0;
	int t;
	int q = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	for (i = 0; i < n; i++)
	{
	st[i] = new Scanner(System.in).nextLine();
	if ((st[i][0] < 'A' || (st[i][0]>'Z' && st[i][0] < 'a') || st[i][0]>'z') && st[i][0] != '_')
	{
	System.out.print("0");
	System.out.print("\n");
	continue;
	}
	for (j = 1;st[i][j] != '\0';j++)
	{
	if (st[i][j] < 'A' || (st[i][j]>'Z' && st[i][j] < 'a') || st[i][j]>'z')
	{
	if (st[i][j] == '_' || (st[i][j] >= '0' && st[i][j] <= '9'))
	{
	continue;
	}
	else
	{
		k++;
	}
	}
	}
	if (k == 0)
	{
	System.out.print("1");
	System.out.print("\n");
	}
	else
	{
	System.out.print("0");
	System.out.print("\n");
	}
	k = 0;
	}
	return 0;
	}
}

