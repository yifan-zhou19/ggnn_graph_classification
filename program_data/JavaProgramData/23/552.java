import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int m = 0;
		int x;
		int y;
		int z;
		int num;
		final String a = "";
		final String b = "";
		a = new Scanner(System.in).nextLine(); //??
		num = a.length();
		a = tangible.StringFunctions.changeCharacter(a, num, '\n'); //?????????
		for (i = 0;i <= num;i++)
		{
			if (a.charAt(i) == ' ' || a.charAt(i) == '\n') //??????????
			{
					for (k = j;k < i;k++)
					{
					b.charAt(m)[k - j] = a.charAt(k); //????
					}
				m = m + 1;
				j = i + 1;
			}
		}
		for (x = m - 1;x > 0;x--)
		{
			System.out.print(b.charAt(x));
			System.out.print(" ");
		}
		System.out.print(b.charAt(0));
		return 0;
	}
}

