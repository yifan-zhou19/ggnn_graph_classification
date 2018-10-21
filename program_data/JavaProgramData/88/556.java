import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		String p = a;
		int i = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i += 1)
		{
			if (*(p.Substring(i)) > 47 && *(p.Substring(i)) < 58)
			{
				System.out.print((p.Substring(i)));
			}
			else if ((*(p.Substring(i)) <= 47 || *(p.Substring(i)) >= 58) && (*(p.Substring(i) + 1) > 47 && *(p.Substring(i) + 1) < 58))
			{
					System.out.print("\n");
			}
		}
		return 0;
	}
}
