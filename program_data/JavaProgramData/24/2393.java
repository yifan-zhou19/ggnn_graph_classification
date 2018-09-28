import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[205]);
		int i;
		int j;
		int count = 0;
		int max = 0;
		int min = 250;
		int m;
		int n;
		a = new Scanner(System.in).nextLine();
		for (i = 0; i < a.length();)
		{
			for (j = i; a.charAt(j) != '\0'; j++)
			{
				if (a.charAt(j) != ' ' && a.charAt(j) != ',')
				{
					count++;
				}
				else
				{
					if (a.charAt(j - 1) != ' ' && a.charAt(j - 1) != ',')
					{
						if (count > max)
						{
							max = count;
							m = i;
						}
						if (count < min)
						{
							min = count;
							n = i;
						}
					}
					break;
				}
			}
			if (a.charAt(j - 1) != ' ' && a.charAt(j - 1) != ',')
			{
				if (count > max)
				{
					max = count;
					m = i;
				}
				if (count < min)
				{
					min = count;
					n = i;
				}
			}
			count = 0;
			i = j + 1;
		}
		for (i = m; (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0'); i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		for (i = n; (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0'); i++)
		{
			System.out.print(a.charAt(i));
		}

		return 0;
	}
}
