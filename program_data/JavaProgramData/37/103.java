import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		String str = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < t; i++)
		{

			str = new Scanner(System.in).nextLine();
			int p = str.length();
			int[] count = new int[27];
			int flag = 0;
			for (j = 0; j < p; j++)
			{
				count[str.charAt(j) - 96]++;
			}
			for (k = 1; k <= 26; k++)
			{
				if (count[k] == 1)
				{
					System.out.print((char)(k + 96));
					System.out.print("\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

