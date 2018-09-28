import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[505]);
		char[][] d = new char[505][6];
		char[][] e = new char[505][6];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d, 0, (Character.SIZE / Byte.SIZE));
		int n;
		int tmp = 0;
		int max = 0;
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		c = new Scanner(System.in).nextLine();
		for (int i = 0; i <= c.length() - n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				 d[i][j] = c.charAt(i + j);
			}
		}
		for (int i = 0; i <= c.length() - n; i++)
		{
			tmp = 1;
			if (d[i][0] != 0)
			{
				for (int j = i + 1; j <= c.length() - n; j++)
				{
					if (strcmp(d[i], d[j]) == 0)
					{
						tmp++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						memset(d[j], 0, 6);
					}
				}
			}
			else
			{
				continue;
			}
			if (tmp > max)
			{
				max = tmp;
				temp = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(e, 0, (Character.SIZE / Byte.SIZE));
				e[temp] = d[i];
			}
			if (tmp == max)
			{
				e[temp] = d[i];
				temp++;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (int i = 0; i < temp; i++)
			{
				System.out.print(e[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

