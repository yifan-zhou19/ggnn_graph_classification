import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void ggg(int i, String b)
	{
		int len;
		int j;
		int k;
		int flag;
		len = b.length();
		for (j = 0;j <= (len - i);j++)
		{
			for (k = 0;k < i / 2;k++)
			{
				if (b[j + k].equals(b[j + i - k - 1]))
				{
					flag = 1;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				for (k = j;k < j + i; k++)
				{
					System.out.print(b[k]);
				}
				System.out.print('\n');
			}
		}
	}
	public static int Main()
	{
		int i;
		int len;
		String a = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 2;i <= len;i = i + 2)
		{
			ggg(i, a);
		}
	return 0;
	}



}
