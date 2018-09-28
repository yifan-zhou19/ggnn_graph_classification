import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************
	//*??? : ???????????? *
	//*??   : ???                   *
	//*??   : 2011?10?               *
	//*****************************
	public static int Main()
	{
		int t;
		int i;
		int j;
		int g = 0;
		int k;
		int m;
		int count = 0;
		String a = new String(new char[1000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 1; k <= t; k++)
		{
			a = new Scanner(System.in).nextLine();
			m = a.length();
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < m; j++)
				{
					if (a.charAt(i) == a.charAt(j))
					{
						count++;
					}
				}
				if (count == 1)
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
					g = 1;
					count = 0;
					break;
				}
				count = 0;
				g = 0;
			}
			if (g == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

