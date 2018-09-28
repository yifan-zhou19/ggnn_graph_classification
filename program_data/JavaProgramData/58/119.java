import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int l;
		String x = new String(new char[100]);
		y = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (i = 0;i < n;i++)
		{
			x = new Scanner(System.in).nextLine();

			y = 1;
			l = x.length();
			if (x.charAt(0) == '_' || (x.charAt(0) >= 'A' && x.charAt(0) <= 'Z') || (x.charAt(0) >= 'a' && x.charAt(0) <= 'z'))
			{


				for (j = 0;j < l;j++)
				{
					if (((x.charAt(j) >= 'A' && x.charAt(j) <= 'Z') || (x.charAt(j) >= 'a' && x.charAt(j) <= 'z') || (x.charAt(j) >= '0' && x.charAt(j) <= '9') || (x.charAt(j) == '_')) == 0)
					{
						y = 0;

					}
				}


				if (y == 0)
				{
					System.out.print("0");
					System.out.print("\n");
				}
				if (y == 1)
				{
					System.out.print("1");
					System.out.print("\n");
				}




			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}


		}




		return 0;
	}
}

