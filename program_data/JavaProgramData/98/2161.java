import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[1000][30];
	public static int[] la = new int[100];

	public static int Main()
	{
		int n;
		int i;
		String b = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		b = new Scanner(System.in).nextLine();
		int lb = b.length();
		int p = 0;
		int t = 1;
		for (i = 0; i <= lb - 1; i++)
		{
			if (b.charAt(i) == ' ')
			{
				t++;
				p = 0;
			}
			else
			{
				a[t][p] = b.charAt(i);
				p++;
			}
		}
		for (i = 1; i <= n; i++)
		{
			la[i] = String.valueOf(a[i]).length();
		}
		int num = 0;
		for (i = 1; i <= n; i++)
		{
			System.out.print(a[i]);
			num = num + la[i];
			if ((num + 1 + la[i + 1] <= 80) && (i != n))
			{
				System.out.print(" ");
				num++;
			}
			else
			{
				System.out.print("\n");
				num = 0;
			}
		}
		return 0;
	}
}

