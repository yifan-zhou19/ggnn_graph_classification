import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int r = 0;
		int z1;
		int len;
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		a = new Scanner(System.in).nextLine();
		len = a.length();

		if (len == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(a.charAt(0) - '0');
			System.out.print("\n");
		}
		if (len == 2)
		{
			System.out.print(((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13);
			System.out.print("\n");
			System.out.print(((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13);
			System.out.print("\n");

		}
		if (len >= 3)
		{
			r = a.charAt(0) - '0';
		for (i = 1; a.charAt(i) != 0; i++)
		{
			z1 = r * 10 + (a.charAt(i) - '0');
			b[i - 1] = z1 / 13;
			r = z1 % 13;
		}

		if (b[0] == 0)
		{
			for (j = 1; j < i - 1; j++)
			{
				System.out.print(b[j]);
			}
		}
		else
		{
			for (j = 0; j < i - 1; j++)
			{
				System.out.print(b[j]);
			}
		}
			System.out.print("\n");
			System.out.print(r);
		}
		return 0;
	}



}
