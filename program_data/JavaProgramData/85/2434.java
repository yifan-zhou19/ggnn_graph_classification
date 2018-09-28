import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag;
		String a = new String(new char[22]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			flag = 0;
			a = new Scanner(System.in).nextLine();
			for (int i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(0) < 65 || (a.charAt(0)>90 && a.charAt(0) < 97 && a.charAt(0) != 95) || a.charAt(0)>122)
				{
					System.out.print("no");
					System.out.print("\n");
					System.out.print("\n");
					flag = 1;
					break;
				}
				else if (a.charAt(i) < 48 || (a.charAt(i)>57 && a.charAt(i) < 65) || (a.charAt(i)>90 && a.charAt(i) < 97 && a.charAt(i) != 95) || a.charAt(i)>122)
				{
					System.out.print("no");
					System.out.print("\n");
					System.out.print("\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("yes");
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

