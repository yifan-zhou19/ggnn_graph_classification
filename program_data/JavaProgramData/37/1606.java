import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????
		for (i = 0;i < t;i++)
		{
			int[] num = new int[26]; //num[]????26?????????????
			int j;
			int k;
			int length = 0;
			int x = 0;
			final String ch = "";
			ch = new Scanner(System.in).nextLine();
			length = ch.length(); //????????
			for (j = 0;j < length;j++)
			{
				k = ch.charAt(j) - 'a';
				num[k]++; //?26???????????????
			}
			for (j = 0;j < length;j++)
			{
				k = ch.charAt(j) - 'a';
				if (num[k] == 1)
				{
					System.out.print(ch.charAt(j));
					System.out.print("\n");
					x = 1;
					break;
				}
			}
			if (x == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

