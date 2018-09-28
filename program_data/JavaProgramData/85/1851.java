import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??n??????????
		String a = new String(new char[100]);
		for (int i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine(); //????????
			int x = a.length();
			int counter = 0;
			for (int j = 0;j < x;j++)
			{
				if (j == 0 && ((a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || a.charAt(j) == '_'))
				{
					counter = 0; //??????????
				}
				else if (j != 0 && ((a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || a.charAt(j) == '_'))
				{
					counter = 0;
				}
				else
				{
					counter = 1;
					break;
				}
			}
			if (counter == 0)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

