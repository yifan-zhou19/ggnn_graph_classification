import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int num;
		int j;
		int i = 0;
		int x;
		  int[] b = new int[100];
		int[] r = new int[100];
		r[0] = a.charAt(0) - '0';
		while (a.charAt(i) != '\0')
		{
			num = r[i] * 10 + a.charAt(i + 1) - '0';
			r[i + 1] = num % 13;
			b[i] = num / 13;
			i++;
		}
		for (j = 0;j <= i - 2;j++)
		{
			if (b[j] != 0)
			{
				break;
			}
		}
		if (j == i - 1)
		{
			System.out.print(0);
		}
		else
		{
			x = j;
		for (j = x;j <= i - 2;j++)
		{
			System.out.print(b[j]);
		}
		}
		System.out.print('\n');
		System.out.print(r[i - 1]);
		System.out.print("\n");
		return 0;
	}
}
