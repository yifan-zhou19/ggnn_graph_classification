import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int boy; //???????????????
	public static int girl;
	public static int l = 0;
	public static void match(String c, int left)
	{
		int i = 0;
		int j = 0;
		for (i = 0;i < l;i++)
		{
			if (c[i].equals(girl))
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (c[j].equals(boy))
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						break;
					}
				}
				c[i] = '0';
				c[j] = '0';
				left = left - 2;
				break;
			}
		}
		if (left > 0)
		{
			match(c, left);
		}
	}
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		boy = str.charAt(0);
		l = str.length();
		girl = str.charAt(l - 2);
		match(str, l);
		return 0;
	}
}
