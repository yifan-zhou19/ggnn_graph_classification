import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void f(String a, char b)
	{
		int i;
		int j;
		int k;
		int sum = 0;
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (a[i].equals(b))
			{
				continue;
			}
			for (j = i - 1;j >= 0;j--)
			{
				for (k = j;k <= i;k++)
				{
					if (a[k].equals(b))
					{
						sum++;
					}
				}
				if (sum == (i - j + 1) / 2.0)
				{
					sum = 0;
					System.out.print(j);
					System.out.print(' ');
					System.out.print(i);
					System.out.print("\n");
					break;
				}
				sum = 0;

			}
		}
	}
	public static int Main()
	{
		 String a = new String(new char[99]);
		 char b;
		a = new Scanner(System.in).nextLine();
		b = a.charAt(0);
		f(a, b);
		return 0;
	}
}
