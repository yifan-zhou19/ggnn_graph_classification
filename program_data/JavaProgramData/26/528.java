import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] flag = new int[100];
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int n;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			flag[i] = 1;
		}
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == ' ')
			{
				n = i;
				for (j = n + 1; a.charAt(j) == ' '; j++)
				{
					if (a.charAt(j) == ' ')
					{
						flag[j] = 0;
					}
				}

			}
		}
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (flag[i] == 1)
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}


}
