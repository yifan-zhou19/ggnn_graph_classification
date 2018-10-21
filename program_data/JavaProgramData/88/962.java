import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[33]);
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 33;i++)
		{
			if (a.charAt(i) == '\0')
			{
					n = i;
					break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (((int)a.charAt(i)) < 58 && ((int)a.charAt(i))>47)
			{
				System.out.print(a.charAt(i));
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}
