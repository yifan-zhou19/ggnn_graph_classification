import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int p = 1;
	public static int f(String str, int lens)
	{
		int i;
		int j;
		int flag = 0;
		int k = p;
		for (i = 0;i < lens;i++)
		{
			while (str[i - k + 1].equals(str[i + k]) && (i - k + 1) >= 0 && i + k < lens && k>0)
			{
			k--;
			}
			if (k == 0)
			{
				flag = 1;
				for (j = i - p + 1;j <= i + p;j++)
				{
					System.out.print(str[j]);
				}
				System.out.print("\n");
			}
			k = p;
		}
		p++;
		if (flag == 1)
		{
			f(str, lens);
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String str = new String(new char[500]);
		char lens;
		str = new Scanner(System.in).nextLine();
		lens = str.length();
		f(str, lens);
		return 0;
	}
}
