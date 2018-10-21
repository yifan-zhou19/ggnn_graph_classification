import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*??
	???????????(????????)?????????????????????????
	????
	?????????????????100?
	????
	?????????????
	????
	I am a student
	????
	student a am I
	 */
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int[] b = new int[100];
		int x = 0;
		int y = 0;
		int z;
		char[][] a = new char[101][101];
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (i = 1;i <= 101;i++)
		{
			for (j = 1;j < 101;j++)
			{
				if (s.charAt(k) == ' ' || s.charAt(k) == '\0' || s.charAt(k) == '\n')
				{
					b[i] = x;
					x = 0;
					break;
				}
				else
				{
					x++;
					a[i][j] = s.charAt(k);
					k++;
				}
			}
			y++;
			if (s.charAt(k) == '\0' || s.charAt(k) == '\n')
			{
				break;
			}
			k++;
		}
		for (i = y;i >= 1;i--)
		{
			for (j = 1;j <= b[i];j++)
			{
				System.out.print(a[i][j]);
			}
			if (i != 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}
