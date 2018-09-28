import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int flag;
		String s = new String(new char[31]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		flag = 0;
		for (i = 0; i <= l - 1 ; i++)
		{
			if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
			{
				flag = 1;
				System.out.print(s.charAt(i));
			}
			else
			{
				if (flag == 1)
				{
					System.out.print("\n");
				}
				flag = 0;
			}
		}
		return 0;
	}

}
