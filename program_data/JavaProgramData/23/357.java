import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char[][] str1 = new char[100][100];
		str = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				str1[i][j] = '#';
			}
		}
		int len = 0;
		i = 0;
		while (str.charAt(i) != '\0')
		{
			len++;
			i++;
		}
		int n = 0;
		int p = 0;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == ' ')
			{
				n++;
				p = i + 1;
			}
			else
			{
				str1[n][i - p] = str.charAt(i);
			}
		}
		int k = 0;
		for (i = n;i > 0;i--)
		{
			k = 0;
			while (str1[i][k] != '#')
			{
				System.out.print(str1[i][k]);
				k++;
			}
			System.out.print(" ");
		}
		k = 0;
		while (str1[0][k] != '#')
		{
			System.out.print(str1[0][k]);
			k++;
		}
		return 0;
	}

}
