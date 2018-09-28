import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[][] str = new char[100][10001];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] num = new int[26];
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num, 0, (Integer.SIZE / Byte.SIZE));
			for (j = 0; str[i][j] != '\0'; j++)
			{
				for (k = 0; k < 26; k++)
				{
					if (str[i][j] == 'a' + k)
					{
						num[k]++;
					}
				}
			}
			for (j = 0; str[i][j] != '\0'; j++)
			{
				l = str[i][j] - 'a';
				if (num[l] == 1)
				{
					System.out.print(str[i][j]);
					System.out.print("\n");
					break;
				}
			}
			for (k = 0; k < 26; k++)
			{
				if (num[k] == 1)
				{
					break;
				}
			}
			if (k == 26)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}




}

