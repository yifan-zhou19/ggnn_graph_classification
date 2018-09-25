import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		String a = new String(new char[1000]);
		int i;
		int j;
		while (a = new Scanner(System.in).nextLine())
		{
			int l = a.length();
			for (i = 0; i < l; i++)
			{
				if (a.charAt(i) == '(')
				{
					x[i] = 1;
				}
				else if (a.charAt(i) == ')')
				{
					x[i] = -1;
				}
				else
				{
					x[i] = 0;
				}
			}
			for (i = 1; i < l; i++)
			{
				for (j = 0; j < l - i; j++)
				{
					if (x[j] == 1 && x[i + j] == -1)
					{
						x[j] = x[i + j] = 0;
					}
				}
			}
			System.out.print(a);
			System.out.print("\n");
			for (i = 0; i < l; i++)
			{
				if (x[i] == 1)
				{
					System.out.print("$");
				}
				else if (x[i] == -1)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
