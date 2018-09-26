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
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[200][100];
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (j = 1;j <= n;j++)
		{
			b = 1;
			if (a[j][0] < 65 || (a[j][0]>90 && a[j][0] < 95) || a[j][0] == 96 || a[j][0]>122)
			{
				b = 0;
			}
			for (k = 1;a[j][k] != '\0';k++)
			{
				if (a[j][k] < 48 || (a[j][k]>57 && a[j][k] < 65) || (a[j][k]>90 && a[j][k] < 95) || a[j][k] == 96 || a[j][k]>122)
				{
					b = 0;
				}
			}
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}

}

