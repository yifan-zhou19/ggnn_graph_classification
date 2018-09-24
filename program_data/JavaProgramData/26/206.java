import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String p;
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		p = a;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				for (j = i + 1; ;j++)
				{
					if (*(p.Substring(j)) == ' ')
					{
						j--;
						for (k = j; * (p.Substring(k)) != '\0';k++)
						{
							*(p.Substring(k)) = *(p.Substring(k) + 1);
						}
					}
					else
					{
						break;
					}
				}
				i = j;
			}
		}
			System.out.print(p);
			System.out.print("\n");
			return 0;
	}
}
