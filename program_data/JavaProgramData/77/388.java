import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void qianshou(int[] a, int len)
	{
		int i;
		int j;
		int flag = 0;
		for (i = 1; i < len; i++)
		{
			if (a[i] == 2)
			{
				for (j = i - 1; j >= 0 ; j--)
				{
					if (a[j] == 1)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a[j] = 0;
						a[i] = 0;
						break;
					}
				}
			}
		}

	}
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] a = new int[100];
		int i = 0;
		str = new Scanner(System.in).nextLine();
		int len;
		len = str.length();
		for (i = 0; i < len; i++)
		{
			if (str.charAt(0) - '0' == str.charAt(i) - '0')
			{
				a[i] = 1;
			}
			else
			{
				a[i] = 2;
			}
		}
		qianshou(a, len);
		return 0;
	}


}
