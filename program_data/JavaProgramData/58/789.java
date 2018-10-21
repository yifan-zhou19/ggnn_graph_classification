import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int first_test(char a)
	{
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a == '_')
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int test(char a)
	{
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a == '_' || (a >= '0' && a <= '9'))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		char[][] a = new char[101][85];
		int n;
		int i;
		int j;
		int l;
		int final;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			l = String.valueOf(a[i]).length();
			final = first_test(a[i][0]);
			for (j = 1;j < l;j++)
			{
				final = final * test(a[i][j]);
			}
			System.out.print(final);
			System.out.print("\n");
		}
		return 0;
	}
}

