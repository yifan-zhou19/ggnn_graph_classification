import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int x = 0;
		String c = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			b = 1;
			c = new Scanner(System.in).nextLine();
			if (!(c.charAt(0) > 64 && c.charAt(0) < 91 || c.charAt(0) == 95 || c.charAt(0)>96 && c.charAt(0) < 123))
			{
				b = 0;
			}
			for (j = 0;c.charAt(j) != '\0';j++)
			{
				if (!(c.charAt(j) > 64 && c.charAt(j) < 91 || c.charAt(j) == 95 || c.charAt(j)>96 && c.charAt(j) < 123 || c.charAt(j)>47 && c.charAt(j) < 58))
				{
					b = 0;
				}
			}
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}
}

