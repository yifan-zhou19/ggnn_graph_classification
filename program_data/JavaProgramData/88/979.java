import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		String p;
		a = new Scanner(System.in).nextLine();
		p = a;
		int flag = 0;
		int sum = 0;
		for (int i = 0;p.charAt(i) != '\0';i++)
		{
			if (p.charAt(i) >= '0' && p.charAt(i) <= '9')
			{
				flag = 0;
				System.out.print(p.charAt(i));
				sum++;
			}
			else
			{
				flag++;
				if (sum != 0 && flag == 1)
				{
					System.out.print("\n");
					sum = 0;
				}
			}
		}
		return 0;
	}
}
