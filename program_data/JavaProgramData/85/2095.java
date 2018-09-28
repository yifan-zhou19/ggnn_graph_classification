import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		String s = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = new Scanner(System.in).nextLine();
		while (n > 0)
		{
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		p = 0;
		if ((s.charAt(0) == '_') || ((s.charAt(0) - 'a' >= 0) && (s.charAt(0) - 'a' < 26)) || ((s.charAt(0) - 'A' >= 0) && (s.charAt(0) - 'A' < 26)))
		{
			p = 1;
		}
		for (int i = 1;i < l;i++)
		{
		if (!((s.charAt(i) == '_') || ((s.charAt(i) - 'a' >= 0) && (s.charAt(i) - 'a' < 26)) || ((s.charAt(i) - 'A' >= 0) && (s.charAt(i) - 'A' < 26)) || ((s.charAt(i) - '0' >= 0) && (s.charAt(i) - '0' < 10))))
		{
			p = 0;
		}
		}
			if (p != 0)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
			n--;
		}
	//cin>>l;
	}

}

