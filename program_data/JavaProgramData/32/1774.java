import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] seline1 = new char[100][100];
		char[][] seline2 = new char[100][100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int k = 0;k < n - 1;k++)
		{
			seline1[k] = new Scanner(System.in).nextLine();
			seline2[k] = new Scanner(System.in).nextLine();
			System.in.read();
		}
			seline1[n - 1] = new Scanner(System.in).nextLine();
			seline2[n - 1] = new Scanner(System.in).nextLine();
		for (int k = 0;k < n;k++)
		{
			int l1 = String.valueOf(seline1[k]).length();
			int[] an1 = new int[100];
			int[] an2 = new int[100];
			int l2 = String.valueOf(seline2[k]).length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an2, 0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0;i < l1;i++)
			{
				an1[i] = seline1[k][l1 - i - 1] - '0'; //???????????????
			}
			for (int i = 0;i < l2;i++)
			{
				an2[i] = seline2[k][l2 - i - 1] - '0';
			}
			for (int j = 0;j < l1;j++)
			{
				if (an1[j] >= an2[j])
				{
					an1[j] -= an2[j];
				}
				else
				{
					an1[j + 1]--;
					an1[j] = an1[j] + 10 - an2[j];
				}
			}
			int t = 99;
			while (an1[t] == 0)
			{
				t--;
			}
			for (;t >= 0;t--)
			{
				System.out.print(an1[t]);
			}
			System.out.print("\n");
		}
			return 0;
	}
}

