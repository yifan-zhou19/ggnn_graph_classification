import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[110]);
		char boy;
		char girl;
		int[] b = new int[110];
		int[] g = new int[110];
		int p = 1;
		int s = 0;
		int[] lin = new int[110];
		int[] mark = new int[110];
		int len;
		for (int i = 0;i <= 109;i++)
		{
			lin[i] = i;
		}
		line = new Scanner(System.in).nextLine();
		len = line.length() - 1;
		boy = line.charAt(0);
		for (int i = 0;i <= len;i++)
		{
			if (line.charAt(i) != boy)
			{
				girl = line.charAt(i);
				break;
			}
		}
		while (s < len + 1)
		{
			for (int i = 0;i <= len - 1;i++)
			{
				if (line.charAt(i) == boy && line.charAt(i + 1) == girl)
				{
					b[p] = lin[i];
					g[p] = lin[i + 1];
					p++;
					for (int j = i + 2;j <= len;j++)
					{
						line = tangible.StringFunctions.changeCharacter(line, j - 2, line.charAt(j));
						lin[j - 2] = lin[j];
					}
					s = s + 2;
				}
			}
		}
		for (int i = 1;i <= p - 2;i++)
		{
			for (int j = 1;j <= p - 1 - i;j++)
			{
				if (g[j] > g[j + 1])
				{
					int temp = g[j];
					g[j] = g[j + 1];
					g[j + 1] = temp;
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (int i = 1;i <= p - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
			System.out.print(g[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

