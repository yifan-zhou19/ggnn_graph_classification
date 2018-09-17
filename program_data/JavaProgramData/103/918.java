import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		int i = 1;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		while (true)
		{
			if (a.charAt(i) == a.charAt(i - 1) || (a.charAt(i) - a.charAt(i - 1)) == 32 || (a.charAt(i) - a.charAt(i - 1)) == -32)
			{
			   k++;
			}
			else
			{
				if ((a.charAt(i - 1) - 'a') >= 0)
				{
					a.charAt(i - 1) -= 32;
				}
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(k + 1);
				System.out.print(")");
				k = 0;
			}
			if (a.charAt(i) == '\0')
			{
				break;
			}
			i++;
		}
		return 0;
	}

}
