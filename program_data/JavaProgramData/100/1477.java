import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		char a;
		int i;
		int j;
		int p;
		str = new Scanner(System.in).nextLine();
		a = 65;
		p = 0;
		for (i = 0; ; i++)
		{
			if (str.charAt(i) == '\0')
			{
				break;
			}
			if (((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) || ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')))
			{
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("No");
			System.out.print("\n");
		}
		else
		{
			while (a < 91)
			{
				j = 0;
				for (i = 0; ; i++)
				{
					if (str.charAt(i) == '\0')
					{
						break;
					}
					if (str.charAt(i) == a)
					{
						j++;
					}
				}
				if (j != 0)
				{
					System.out.print(a);
					System.out.print('=');
					System.out.print(j);
					System.out.print("\n");
				}
				a++;
			}
			a = 97;
			while (a < 123)
			{
				j = 0;
				for (i = 0; ; i++)
				{
					if (str.charAt(i) == '\0')
					{
						break;
					}
					if (str.charAt(i) == a)
					{
						j++;
					}
				}
				if (j != 0)
				{
					System.out.print(a);
					System.out.print('=');
					System.out.print(j);
					System.out.print("\n");
				}
				a++;
			}
		}
		return 0;
	}

}
