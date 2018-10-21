import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int istrue;
		int len;
		int i;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n -- != 0)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			istrue = 1;
			if ((a.charAt(0) != '_') && (a.charAt(0) < 'a' || a.charAt(0) > 'z') && (a.charAt(0) < 'A' || a.charAt(0) > 'Z'))
			{
				istrue = 0;
			}
			for (i = 1; i < len; i++)
			{
				if ((a.charAt(i) != '_') && (a.charAt(i) < 'a' || a.charAt(i) > 'z') && (a.charAt(i) < 'A' || a.charAt(i) > 'Z') && (a.charAt(i) > '9' || a.charAt(i) < '0'))
				{
					istrue = 0;
				}
			}
			System.out.print(istrue);
			System.out.print("\n");
		}
	}
}

