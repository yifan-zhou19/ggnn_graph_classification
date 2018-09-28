import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (int i = 0;i < len;i++)
		{
			if ('0' <= a.charAt(i) && a.charAt(i) <= '9')
			{
				System.out.print(a.charAt(i));
			}
			else
			{
				System.out.print("\n");
				for (int j = i;j < len;j++)
				{
					if ('0' <= a.charAt(i) && a.charAt(i) <= '9')
					{
						System.out.print(a.charAt(j));
						break;
					}
					i++;
				}
			}
		}
		return 0;
	}

}
