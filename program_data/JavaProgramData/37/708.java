import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int t;
		int i;
		int j;
		int g;
		int l;
		String a = new String(new char[100000]);
		int count = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= t;i++)
		{
			j = 0;


			a = new Scanner(System.in).nextLine();
			while (a.charAt(j) != '\0')
			{
				l = 0;
				count = 0;
				g = 0;
				while (a.charAt(g) != '\0')
				{
					if (a.charAt(j) == a.charAt(g))
					{
						count++;
					}
					g++;
				}


				if (count == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					l = 1;
					break;
				}
				j++;
			}
			if (l == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

