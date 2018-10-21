import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= t;k++)
		{
			System.in.read();
			String str = new String(new char[1000002]);
			str = new Scanner(System.in).nextLine();
			int i;
			int j;
			int count;
			int len;
			len = str.length();
			int p = len;
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				count = 0;
				for (j = 0;str.charAt(j) != '\0';j++)
				{
					if (str.charAt(i) == str.charAt(j) && i != j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
				if ((count == len) && (i < p))
				{
					p = i;
				}
			}
			if (p == len)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(str.charAt(p));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

