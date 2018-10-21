import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int i = 0;
		int n;
		int j;
		int w;
		String s = new String(new char[200]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (j = 1;j <= n;j++)
		{
			i = 0;
			w = 0;
		s = new Scanner(System.in).nextLine();
		if (s.charAt(0) != '_' && ((s.charAt(0) > 'z' || s.charAt(0) < 'a') && (s.charAt(0)>'Z' || s.charAt(0) < 'A')))
		{
			System.out.print("no");
			System.out.print("\n");
			continue;
		}
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != '_' && ((s.charAt(i) > 'z' || s.charAt(i) < 'a') && (s.charAt(i)>'Z' || s.charAt(i) < 'A')) && (s.charAt(i) < '0' || s.charAt(i)>'9'))
			{
				w = 1;
				break;
			}
			i++;
		}
		if (w == 1)
		{
			System.out.print("no");
			System.out.print("\n");
			continue;
		}
		else if (w == 0)
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

