import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String temp = new String(new char[100]);
		int i = 0;
		int k;
		int[] left = new int[100];
		int[] right = new int[100];
		int space = 0;
		temp = new Scanner(System.in).nextLine();
		left[0] = 0;
		for (k = 0;k <= temp.length();k++)
		{
			if ((temp.charAt(k) == ' ') || (temp.charAt(k) == '\0'))
			{
				space++;
				right[i] = k - 1;
				i++;
				left[i] = k + 1;
			}
		}
		for (i = space-1;i >= 0;i--)
		{
			if (i != space-1)
			{
				System.out.print(' ');
			}
			for (k = left[i];k <= right[i];k++)
			{
				System.out.print(temp.charAt(k));
			}
		}
	}
}
