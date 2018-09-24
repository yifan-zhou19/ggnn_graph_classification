import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int num(String a)
	{
		int times = 0;
		int i;
		for (i = 0; !a[i].equals('\0');i++)
		{
			times++;
		}
		return (times);
	}
	public static int Main()
	{
		int n;
		int i;
		int[] yn = new int[100];
		int j;
		int[] times = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 100;i++)
		{
			yn[i] = 0;
		}
		char[][] a = new char[100][80];
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			times[i] = num(a[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == '_' || (a[i][0] >= 97 && a[i][0] <= 122) || (a[i][0] >= 65 && a[i][0] <= 90))
			{
				for (j = 1;j < times[i];j++)
				{
					if (a[i][j] == '_' || (a[i][j] >= 97 && a[i][j] <= 122) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 48 && a[i][j] <= 57))
					{
						yn[i]++;
					}
				}
				if (yn[i] == times[i] - 1)
				{
					yn[i] = 1;
				}
				else
				{
					yn[i] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(yn[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

