import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[60]);
		String p = a;
		p = new Scanner(System.in).nextLine();
		int i = 0;
		int len = p.length();
		do
		{
			if (p.charAt(i) == '-')
			{
				do
				{
				i++;
				}while (p.charAt(i) < 48 || p.charAt(i)>57);
			}
			if (p.charAt(i) >= 48 && p.charAt(i) <= 57)
			{
				do
				{
					System.out.print(p.charAt(i));
					i++;
				}while (p.charAt(i) >= 48 && p.charAt(i) <= 57);
				System.out.print("\n");
			}
			else
			{
				i++;
			}
		}while (i < len);
		return 0;
	}
}
