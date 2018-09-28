import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[100]);
		String p;
		int i;
		int l;
		p = s;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		int sum = l;
		for (i = 0;i < l;i++)
		{
			if (p.charAt(i) == ' ')
			{
				if (p.charAt(i - 1) == ' ')
				{
					int k = i;
					while (p.charAt(i) == ' ')
					{
						i++;
					}
					for (int j = k;j < l - (i - k);j++)
					{
						p = tangible.StringFunctions.changeCharacter(p, j, p.charAt(j + i - k));
					}
					if (i <= sum)
					{
						sum = sum - (i - k);
					}
					i = k;
				}
			}
		}
		for (i = 0;i < sum;i++)
		{
			System.out.print(p.charAt(i));
		}

		return 0;
	}

}

