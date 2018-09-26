import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int b;
		String c = new String(new char[10000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < t;i++)
		{
			int[] a = new int[123];
			c = new Scanner(System.in).nextLine();
			b = 0;
			for (j = 0;c.charAt(j) != '\0';j++)
			{
				a[c.charAt(j)]++;
			}
			for (j = 0;c.charAt(j) != '\0';j++)
			{
				if (a[c.charAt(j)] == 1)
				{
					b = 1;
					System.out.print(c.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (b == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

