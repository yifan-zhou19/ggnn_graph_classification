import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		String str = new String(new char[40]);
		String q;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		q = str;
		for (i = 0; i < len; i++)
		{
			if (*(q.Substring(i)) - '0' >= 0 && *(q.Substring(i)) - '0' <= 9)
			{
				System.out.print((q.Substring(i)));
				if (*(q.Substring(i) + 1) - '0' < 0 || *(q.Substring(i) + 1) - '0' > 9)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
