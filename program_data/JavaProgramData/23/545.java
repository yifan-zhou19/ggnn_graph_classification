import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		a = tangible.StringFunctions.changeCharacter(a, 0, new Scanner(System.in).nextLine()); //????
		int i;
		int num;
		int k;
		int x = 0;
		int p = 0;
		num = String.valueOf(a.charAt(0)).length();
		a.charAt(0)[num] = '\n';
		for (i = 0;i < num + 1;i++)
		{
			if (a.charAt(0)[i] == ' ' || a.charAt(0)[i] == '\n')
			{
				for (k = x;k < i;k++)
				{
				 b.charAt(p)[k - x] = a.charAt(0)[k];
				}
				p++;
				x = i + 1;
			}
		}
		int m;
		for (m = 0;m < p - 1;m++)
		{
			System.out.print(b.charAt(p - 1 - m));
			System.out.print(" ");
		}
		System.out.print(b.charAt(0));


		System.in.read();
		System.in.read();
		return 0;
	}
}

