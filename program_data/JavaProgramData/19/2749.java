import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int q;
		int w;
		int e;
		int i;
		int j;
		int s;
		int shu;
		int n;
		int z;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		q = a.length();
		w = b.length();
		e = c.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			shu = 1;
			s = i;
			for (j = 0;j < w;j++)
			{
				if (a.charAt(s) != b.charAt(j))
				{
					shu = 0;
					break;
				}
				s++;
			}
			if (i == 0)
			{
				if (a.charAt(s) != ' ')
				{
					shu = 0;
				}
			}
			else
			{
				if ((a.charAt(i - 1) != ' ') || ((a.charAt(s) != ' ') && (a.charAt(s) != '\0')))
				{
					shu = 0;
				}

			}
			if (shu == 0)
			{
				continue;
			}
			if (shu == 1)
			{
				if (w >= e)
				{
				for (s = e + i;a.charAt(s) != '\0';s++)
				{
					a = tangible.StringFunctions.changeCharacter(a, s, a.charAt(s + w - e));
				}
				}
				else
				{
					for (z = 0;a.charAt(z) != '\0';z++)
					{
						;
					}

					for (s = z;s >= w + i;s--)
					{
					a = tangible.StringFunctions.changeCharacter(a, s - w + e, a.charAt(s));
					}

				}
				j = 0;
				for (s = i;s < i + e;s++)
				{
					a = tangible.StringFunctions.changeCharacter(a, s, c.charAt(j));
					j++;
				}

			}
		}
		System.out.print(a);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

