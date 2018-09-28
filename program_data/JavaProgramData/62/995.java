import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		a = new Scanner(System.in).nextLine();
		String p = null;
		p = a;
		for (int i = 0;i <= a.length();i++)
		{
		if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) == ' ')
		{
			for (int j = i;j <= a.length() - 1;j++)
			{
				*(p.Substring(j)) = *(p.Substring(j) + 1);
			}
			 i--;
		}
		}
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
		System.out.print((p.Substring(i)));
		}
		return 0;
	}

}
