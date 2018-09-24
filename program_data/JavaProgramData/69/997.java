import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] c = new int[251]; //???250???????251?
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (j = a.length() - 1,i = 0;j >= 0;--j,++i)
		{
			c[i] += a.charAt(j) - 48;
		}
		for (j = b.length() - 1,i = 0;j >= 0;--j,++i)
		{
			c[i + 1] += (b.charAt(j) - 48 + c[i]) / 10;
			c[i] = (b.charAt(j) - 48 + c[i]) % 10;
		}
		for (;c[i] != 0;++i)
		{
			c[i + 1] += c[i] / 10;
			c[i] %= 10;
		}
		for (i = 250;c[i] == 0 && i >= 0;--i)
		{
			;
		}
		if (i >= 0)
		{
			do
			{
				System.out.print(c[i]);
			} while (i-- != 0);
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
	}
}
