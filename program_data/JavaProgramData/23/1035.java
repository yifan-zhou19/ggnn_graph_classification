import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char[][] b = new char[100][100];
		int i = 0;
		int j = 0;
		int l = 0;
		a = new Scanner(System.in).nextLine();
		int k = a.length();
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j++;
				l = 0;
				i++;
			}
			b[j][l] = a.charAt(i);
			l++;

		}


		for (i = 0;i < j;i++)
		{
			System.out.print(b[j - i]);
			System.out.print(" ");
		}
		System.out.print(b[0]);

		return 0;
	}
}
