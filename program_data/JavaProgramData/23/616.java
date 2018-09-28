import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		char[][] b = new char[100][150];
		int sum = 0;
		int i = 0;
		int j = 0;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == ' ')
			{
				sum = sum + 1;
				j = 0;
				continue;
			}
			else
			{
				b[sum][j] = a.charAt(i);
				j = j + 1;
			}
		}
		System.out.print(b[sum]);
		for (i = sum - 1;i >= 0;i--)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		}
		System.out.print("\n");
		return 0;
	}

}
