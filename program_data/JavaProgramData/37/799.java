import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[999999]);
		final String b = "";
		int t;
		int i;
		int j;
		int k;
		int[] sum = new int[26];
		int pp = 0;
		int qq = 0;
		int num = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 1;k <= t;k++)
		{
			a = new Scanner(System.in).nextLine();
			b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
			sum[0] = 1;
			for (i = 1;a.charAt(i) != '\0';i++)
			{
				for (j = 0;j < 26;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						sum[j]++;
						pp++;
					}
				}
				if (pp == 0)
				{
					num++;
					b = tangible.StringFunctions.changeCharacter(b, num, a.charAt(i));
					sum[num] = 1;
				}
				pp = 0;
			}
			for (j = 0;j < 26;j++)
			{
				if (sum[j] == 1 && qq == 0)
				{
					System.out.print(b.charAt(j));
					System.out.print("\n");
					qq++;
				}
			}
			if (qq == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}

		//	cout <<num<<" "<<sum[0]<<sum[1]<<sum[2]<<" "<<b[0]<<b[1]<<b[2];

			pp = 0;
			qq = 0;
			num = 0;
			for (j = 0;j < 26;j++)
			{
				sum[j] = 0;
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			}
			for (j = 0;j <= 999990;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}

		}


		return 0;
	}

}

