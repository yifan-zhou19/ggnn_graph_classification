import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		int t;
		int i;
		int j;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= t; i++)
		{
			int k = 0;
			int len;
			int flag = 0;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (j = 0; j < len; j++)
			{
				flag = 1;
				k = j + 1;
				while (k < len)
				{
					if (str.charAt(k) == str.charAt(j))
					{
						flag = 0;
						str = str.substring(0, k);
					}
					k++;
				}
				if (flag == 0)
				{
					str = str.substring(0, j);
				}

			}
			for (k = 0; k < len; k++)
			{
				if (str.charAt(k) != 0)
				{
					System.out.print(str.charAt(k));
					System.out.print("\n");
					break;
				}
			}
			if (k == len)
			{
				System.out.print("no");
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str, 0, 100010);
		}
		return 0;
	}








}

