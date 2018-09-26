import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int t = 0;
		String a = new String(new char[40]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		while (true)
		{
		for (i = t;i < l;i++)
		{
		if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
		{
		System.out.print(a.charAt(i));
		}
		else
		{
			break;
		}
		}
		if (i > l - 1)
		{
			break;
		}
		System.out.print("\n");
		while (i < l)
		{
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{
				break;
			}

				i++;
		}
		t = i;

		if (i > l - 1)
		{
			break;
		}
		}
	}


}
