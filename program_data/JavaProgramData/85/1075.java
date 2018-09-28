import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int i;
		int j;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			flag = 1;
			for (j = 0;j < 100;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}

			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) != 95 && (a.charAt(0) < 65 || (a.charAt(0)>90 && a.charAt(0) < 97) || a.charAt(0)>122))
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			else
			{
				for (j = 1;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) != 95 && (a.charAt(j) < 65 || (a.charAt(j)>90 && a.charAt(j) < 97) || a.charAt(j)>122) && (a.charAt(j) < 48 || a.charAt(j)>57))
					{
						System.out.print("no");
						System.out.print("\n");
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

