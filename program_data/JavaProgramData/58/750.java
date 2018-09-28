import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] t = new int[100];
	System.in.read();
	char[][] a = new char[100][80];
	int i;
	int j;
	for (i = 0;i < 100;i++)
	{
	for (j = 0;j < 80;j++)
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
		if (!(a[i][0] >= 65 && a[i][0] <= 90 || a[i][0] == 95 || a[i][0] >= 97 && a[i][0] <= 122))
		{
		t[i] = 0;
	continue;
		}
					  for (j = 0;j < 80;j++)
					  {
		if (!(a[i][j] >= 65 && a[i][j] <= 90 || a[i][j] == 95 || a[i][j] >= 97 && a[i][j] <= 122 || a[i][j] >= 48 && a[i][j] <= 57 || a[i][j] == '\0'))
		{
		t[i] = 0;
	break;
		}
					  }
					 if (j == 80)
					 {
	t[i] = 1;
					 }
	}
	for (i = 0;i < n;i++)
	{
		System.out.print(t[i]);
		System.out.print("\n");
	}
		 return 0;
	}

}

