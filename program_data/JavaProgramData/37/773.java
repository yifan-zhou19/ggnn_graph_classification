import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[][] alpha = new int[100][100];
		int check;
		String temp = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			check = 0;
			temp = new Scanner(System.in).nextLine();
			for (j = 0; temp.charAt(j) != '\0'; j++)
			{
				alpha[i][(int)(temp.charAt(j))]++;
			}
			for (k = 10; k < 120; k++)
			{
				if (alpha[i][k] == 1)
				{
				   check = 1;
				}
			}
			if (check == 0)
			{
			   System.out.print("no");
			   System.out.print("\n");
			}

			else
			{
				for (j = 0; temp.charAt(j) != '\0'; j++)
				{
					if (alpha[i][(int)(temp.charAt(j))] == 1)
					{
					  System.out.print(temp.charAt(j));
					  System.out.print("\n");
					  break;
					}
				}

			}

		}

		return 0;
	}

}

