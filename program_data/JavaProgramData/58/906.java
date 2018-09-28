import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char[][] a = new char[n][81]; //??????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{ //????????????
			j = 0;
			if ((a[i][j] == '_') || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')))
			{
				;
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			continue;
			}
			while (a[i][j] != 0)
			{
				if (((a[i][j] == '_') || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || ((a[i][j] >= '0') && (a[i][j] <= '9'))) == 0)
				{
					System.out.print('0');
					System.out.print("\n");
						break;
				}
				j++;
			}
			if (a[i][j] == 0) //????????? ????? ??? �1�
			{
			System.out.print('1');
			System.out.print("\n");
			}
		}
		return 0;
	}

}

