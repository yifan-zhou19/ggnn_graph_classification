import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				for (j = i + 1;j < a.length();j++)
				{
					if (!(a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
						break;
					}
				}
				for (k = i;k < j - 1;k++)
				{
					System.out.print(a.charAt(k));
				}
				System.out.print(a.charAt(j - 1));
				System.out.print("\n");
				i = j;
			}
		}
		return 0;
	}
}
