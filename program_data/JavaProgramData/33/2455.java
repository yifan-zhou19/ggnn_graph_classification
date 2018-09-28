import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			int q;
			q = a.length();
			for (int m = 0;m < q;m++)
			{
				if (a.charAt(m) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(m) == 'T')
				{
					System.out.print("A");
				}
				if (a.charAt(m) == 'G')
				{
					System.out.print("C");
				}
				if (a.charAt(m) == 'C')
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");

		}
		return 0;
	}
}

