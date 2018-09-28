import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char c;
		int[][] s = new int[100][2];
		int len;
		int k = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		for (len = 0;a.charAt(len) != '\0';len++)
		{
			;
		}
		c = a.charAt(0);
		s[k][0] = a.charAt(0);
		s[k++][1] = 0;
		for (i = 1;i < len;i++)
		{
			if (c == a.charAt(i))
			{
				s[k][0] = a.charAt(i);
				s[k++][1] = i;
			}
			else
			{
				System.out.print(s[--k][1]);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}
