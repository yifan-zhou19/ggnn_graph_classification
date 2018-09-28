import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char boy;
		char girl;
		int len;
		int[] a = new int[100];
		int i = 0;
		int j = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		boy = str.charAt(0);
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != boy)
			{
				girl = str.charAt(i);
				break;
			}
		}
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == boy)
			{
				a[i] = 1;
			}
			if (str.charAt(i) == girl)
			{
				a[i] = -1;
			}
		}
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == girl)
			{
				for (j = i - 1;j >= 0;j--)
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
					if (a[j] == -1)
					{
						break;
					}
				}
			}
		}
		return 0;
	}
}
