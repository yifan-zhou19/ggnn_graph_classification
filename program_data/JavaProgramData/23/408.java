import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[120]);

		char[][] b = new char[100][100];
		int i = 0;
		int sum = 1;
		int j = 0;
		int k = -1;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 120;i++)
		{
			if (a.charAt(i) == ' ')
			{
				sum++;
			}
		}
		for (i = 0;i < sum;i++)
		{
			for (j = 0;j < 100;j++)
			{
				k++;
			if (a.charAt(k) != ' ')
			{
				b[i][j] = a.charAt(k);
			}
			else
			{
				b[i][j] = '\0';
				 break;
			}
			}
		}
			for (i = sum - 1;i >= 0;i--)
			{
				if (i == 0)
				{
				System.out.print(b[i]);
				System.out.print("\n");
				}
				else
				{
					System.out.print(b[i]);
					System.out.print(" ");
				}
			}
			return 0;
	}


}
