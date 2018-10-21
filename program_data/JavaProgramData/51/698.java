import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[510]);
	public static char[][] gram = new char[1000][6];
	public static int[] sum = new int[1000];

	public static int Main()
	{
		int n;
		int length;
		int i;
		int j;
		int max;
		int flag = -1;
		int pos;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		str = new Scanner(System.in).nextLine();
		length = str.length();
		//cout << length << endl;
		for (i = 0; i < length - n + 1; i++)
		{
			for (j = 0; j < n; j++)
			{
				gram[i][j] = str.charAt(i + j);
			}
		}
		for (i = 0; i < 100; i++)
		{
			sum[i] = 1;
		}
		for (i = 0; i < length - n + 1; i++)
		{
			if (gram[i][0] == '0')
			{
				continue;
			}
			for (j = i + 1; j < length - n + 1; j++)
			{
				if ((strcmp(gram[j], gram[i])) == 0)
				{
					sum[i]++;
					gram[j][0] = '0';
					sum[j] = 0;
				}
			}
		}
		max = 1;
		for (i = 0; i < length - n + 1; i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				flag++;
				pos = i;
			}
		}
		if (flag == -1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < length - n + 1; i++)
			{
				if (sum[i] == sum[pos])
				{
					System.out.print(gram[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

