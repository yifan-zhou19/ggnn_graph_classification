import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
	char[][] a = new char[2][80]; //????????
	a[0] = new Scanner(System.in).nextLine();
	a[1] = new Scanner(System.in).nextLine();
	for (i = 0;i < 2;i++)
	{
		for (j = 0;j < 80;j++)
		{
			if (a[i][j] == '\0')
			{
				break;
			}
			if (a[i][j] > 96 && a[i][j] < 123)
			{
				a[i][j] = a[i][j] - 32;
			}
		}
	} //???????????????
	if (strcmp(a[0],a[1]) == 0)
	{
		System.out.print('=');
		System.out.print("\n");
	}
	else if (strcmp(a[0],a[1]) > 0)
	{
		System.out.print('>');
		System.out.print("\n");
	}
	else
	{
		System.out.print('<');
		System.out.print("\n");
	}
	return 0; //??
	}
}
