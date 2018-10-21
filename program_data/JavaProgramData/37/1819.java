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
		int l;
		int[] count = new int[26];
		int len;
		int[] flag = new int[50];
		String ans = new String(new char[50]);
		String str = new String(new char[100010]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= t;i++)
		{
			flag[i] = 0;
			for (l = 0;l < 26;l++)
			{
				count[l] = 0;
			}
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (k = 0;k < len;k++)
			{
				count[(int)(str.charAt(k) - 96)] += 1;
			}
			for (j = 0;j < len;j++)
			{
				if (count[(int)(str.charAt(j) - 96)] == 1)
				{
					ans = tangible.StringFunctions.changeCharacter(ans, i, str.charAt(j));
					flag[i] = 1;
					break;
				}
			}
		}
		for (i = 1;i <= t;i++)
		{
			if (flag[i] == 1)
			{
			System.out.print(ans.charAt(i));
			System.out.print("\n");
			}
			else
			{
			System.out.print("no");
			System.out.print("\n");
			}

		}
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

