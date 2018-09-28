import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			flag = 0;
			s = new Scanner(System.in).nextLine();
			 //cout<<s[0]<<"check";
			for (j = 0;j < s.length();j++)
			{
				if ((s[0] != '_' && (s[0] > 'Z' || s[0] < 'A') && (s[0]>'z' || s[0] < 'a')) || s[j] != '_' && (s[j]>'9' || s[j] < '0') && (s[j]>'Z' || s[j] < 'A') && (s[j]>'z' || s[j] < 'a'))
				{
					System.out.print("0");
					System.out.print("\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("1");
				System.out.print("\n");
			}

		}
		return 0;
	}
}

