import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();

		b = new Scanner(System.in).nextLine();
		for (int i = 0;a.charAt(i) != '\0';++i)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) += 32;
			}
		}
		for (int i = 0;a.charAt(i) != '\0';++i)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) += 32;
			}
		}
		for (int i = 0;i < 100;++i)
		{
			if (a.charAt(i) != '\0' && b.charAt(i) != '\0' && (a.charAt(i) == b.charAt(i)))
			{
				continue;
			}
			else if (a.charAt(i) == '\0' || b.charAt(i) == '\0')
			{
					if (a.charAt(i) == b.charAt(i))
					{
						System.out.print("=");
						break;
					}
				else
				{
					System.out.print((a.charAt(i) > b.charAt(i)?">":"<"));
					break;
				}
			}
			else
			{
					System.out.print((a.charAt(i) > b.charAt(i)?">":"<"));
					break;
			}
		}
		return 0;
	}

}
