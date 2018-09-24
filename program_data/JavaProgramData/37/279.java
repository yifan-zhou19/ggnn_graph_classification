import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ???wusy                                                    *
	// ???11,17                                                   *
	// ???????????                                        *
	//****************************************************************
	public static char[][] a = new char[100][100001];
	public static int Main()
	{
		int t;
		int i;
		int j;
		int flag = 0;
		int[] count = new int[26];
		int p;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i <= t - 1; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}

		for (i = 0; i <= t - 1; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count,0,(Integer.SIZE / Byte.SIZE));
			flag = 0;

			for (j = 0; a[i][j] != '\0'; j++)
			{
				p = a[i][j] - 'a';
				count[p]++;
			}

			for (j = 0; j <= 25; j++)
			{
				if (count[a[i][j] - 'a'] == 1)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					flag = 1;
					break;
				}
			}

			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}




}

