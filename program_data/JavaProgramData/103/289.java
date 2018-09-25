import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		int i;
		int temp;
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		temp = 0;
		while (temp < len)
		{
			i = temp + 1;
			while ((i < len) && (a.charAt(i) == a.charAt(temp) || a.charAt(i) - 'a' == a.charAt(temp) - 'A' || a.charAt(i) - 'A' == a.charAt(temp) - 'a'))
			{
				i++;
			}
			if (a.charAt(temp) <= 'Z')
			{
				System.out.print("(");
				System.out.print((char) a.charAt(temp));
				System.out.print(",");
				System.out.print(i - temp);
				System.out.print(")");
			}
			else
			{
				System.out.print("(");
				System.out.print((char)(a.charAt(temp) - 'a' + 'A'));
				System.out.print(",");
				System.out.print(i - temp);
				System.out.print(")");
			}
			temp = i;
		}
		return 0;
	}
}
