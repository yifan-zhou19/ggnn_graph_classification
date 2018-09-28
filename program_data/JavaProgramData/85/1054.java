import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int x;
		int i;
		int j;
		int k;
		int l = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < x;i++)
		{
			k = 0;
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				k++;
			}
			for (j = 0;j < a.length();j++)
			{
				if ((a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) == '_'))
				{
					l++;
				}
				else
				{
					k++;
				}
			}
			if (k > 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print("yes");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

