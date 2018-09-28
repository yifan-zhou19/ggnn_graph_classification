import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int k;
		int len;
		int l;
		str = new Scanner(System.in).nextLine();

		len = str.length();

		for (i = 2;i <= len;i++)
		{
			for (k = 0;k <= len - i;k++)
			{
				for (j = k,l = i + k - 1; j < i + k; j++,l--)
				{
					if (str.charAt(j) != str.charAt(l))
					{
						break;
					}
				}
				if (j == i + k)
				{
					for (j = k;j < i + k;j++)
					{
						System.out.print(str.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}
