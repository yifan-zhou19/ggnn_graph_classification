import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		String p = a;
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				while (*(p.Substring(i) + 1) == ' ')
				{
					for (int j = 1; * (p.Substring(i) + j) != '\0';j++)
					{
						*(p.Substring(i) + j) = *(p.Substring(i) + j + 1);
					}
				}
			}
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;

	}

}
