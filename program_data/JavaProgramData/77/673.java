import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void match(char str[100],int b,int k,int bg[50][2]);
		String str = new String(new char[100]);
		int[][] bg = new int[50][2];
		int i;
		int j;
		int total;
		int len;
		int temp;

		str = new Scanner(System.in).nextLine();
		len = str.length();
		total = len / 2;

		match(str, 0, 0, bg);

		for (i = 1;i < total;i++)
		{
			for (j = 0;j < total - i;j++)
			{
				if (bg[j][1] > bg[j + 1][1])
				{
					temp = bg[j][1];
					bg[j][1] = bg[j + 1][1];
					bg[j + 1][1] = temp;

					temp = bg[j][0];
					bg[j][0] = bg[j + 1][0];
					bg[j + 1][0] = temp;
				}
			}
		}

		for (i = 0;i < total;i++)
		{
			System.out.print(bg[i][0]);
			System.out.print(" ");
			System.out.print(bg[i][1]);
			System.out.print("\n");
		}

		return 0;
	}


	public static void match(String str, int b, int k, int[][] bg)
	{
		char ch = str[0];
		int i;
		int len = str.length();
		int m = 1; // m flags the match case of str[b]


		if (str[b].equals(ch))
		{
			for (i = b + 1;i < len;i++)
			{
				if (str[i].equals(ch))
				{
					m++;
				}
				else
				{
					m--;
				}
				if (m == 0)
				{
					bg[k][0] = b;
					bg[k][1] = i;
					k++;
					break;
				}
			}
		}

		b++;

		if (b != len)
		{
			match(str, b, k, bg);
		}

	}
}
