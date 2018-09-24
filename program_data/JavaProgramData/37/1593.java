import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int t;
		int i;
		int j;
		int[] b = new int[26];
		int p = 0;
		int k;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= t; i++)
		{
			for (k = 0; k < 26; k++)
			{
				b[k] = 0;
			}
			a = new Scanner(System.in).nextLine();
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				b[a.charAt(j) - 'a']++;
			}
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				if (b[a.charAt(j) - 'a'] == 1)
				{
					p++;
					System.out.print(a.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (p == 1)
			{
				p = 0;
				continue;
			}
			if (p == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

