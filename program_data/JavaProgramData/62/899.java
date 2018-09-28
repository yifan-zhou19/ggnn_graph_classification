import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String line = new String(new char[250]);
		line = new Scanner(System.in).nextLine();
		String p_1 = line;
		for (int i = 0; i < line.length(); i++)
		{
			if (* (p_1.Substring(i)) == ' ')
			{
				if (* (p_1.Substring(i) + 1) != ' ')
				{
					System.out.print((p_1.Substring(i)));
				}
			}
			else
			{
				System.out.print((p_1.Substring(i)));
			}
		}

	}
}
