import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int na = 0;
		int t0 = 1;
		int t = 1;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int a0;
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			a0 = (int)a.charAt(0);
			for (j = 0;j <= 80;j++)
			{
				if (a.charAt(j) == '\0')
				{
					na = j;
					break;
				}
			}

			if (a.charAt(0) != '_' && ((a0 > 122) || (a0 < 65)))
			{
				t0 = 0;
			}
			if (a.charAt(0) == '_' || ((a0 >= 65) && (a0 <= 90)) || ((a0 >= 97) && (a0 <= 122)))
			{
				t0 = 1;
			}
			if (na == 1 && t0 == 0)
			{
				t = 0;
			}
			if (na == 1 && t0 == 1)
			{
				t = 1;
			}
			if (na > 1 && t0 == 0)
			{
				t = 0;
			}
			if (na > 1 && t0 == 1)
			{
				for (j = 1;j < na;j++)
				{
					int aj;
					aj = (int)a.charAt(j);
					if (aj == 95 || (aj >= 48 && aj <= 57) || (aj >= 65 && aj <= 90) || (aj >= 97 && aj <= 122))
					{
						t = 1;
					}
					else
					{
						t = 0;
						break;
					}
				}
			}
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}

}

