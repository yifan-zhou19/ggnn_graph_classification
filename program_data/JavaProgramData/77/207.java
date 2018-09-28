import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] flag = new int[100];
	public static void pailie(String b, int l)
	{
		int i;
		int j;
		int g = 0;
		if (flag[l - 1] == 1)
		{
			;
		}
			else
			{
		   for (i = 0,g = 0;i < l;i++)
		   {
			if (flag[i] == 1)
			{
				continue;
			}
			for (j = i + 1;j < l;j++)
			{
				if (flag[j] == 1)
				{
					continue;
				}
				if (!b[i].equals(b[j]))
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
					flag[j] = 1;
					g = 1;
					flag[i] = 1;
					break;
				}
				else
				{
					break;
				}
			}
			if (g == 1)
			{
				break;
			}
		   }
		pailie(b, l);
			}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		pailie(a, len);
		return 0;
	}
}
