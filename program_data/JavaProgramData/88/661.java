import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[32]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i;
		int j;
		int k;
		for (i = 0; i < len; i++)
		{
			if (*(str.Substring(i)) >= '0' && str.charAt(i) <= '9')
			{ //?????????????????????
				for (j = 1; * (str.Substring(i) + j) >= '0' && *(str.Substring(i) + j) <= '9'; j++)
				{
					;
				}
				for (k = 0; k < j; k++)
				{
					System.out.print((str.Substring(i) + k));
				}
				System.out.print("\n");
				i += j - 1;
			}
		}
		return 0;
	}
}
