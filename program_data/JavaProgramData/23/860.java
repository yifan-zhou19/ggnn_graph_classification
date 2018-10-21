import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[200]);
		String[] a = new String[30];
		int i;
		int k;

		for (i = 0;i < 30;i++)
		{
			a[i] = null;
		}
		ch = new Scanner(System.in).nextLine();
		a[0] = tangible.StringFunctions.strTok(ch," ");
		i = 1;
		while ((a[i] = tangible.StringFunctions.strTok(null," ")) != null)
		{
			i++;
		}
		for (k = i - 1;k > 0;k--)
		{
			System.out.print(a[k]);
			System.out.print(' ');
		}
		System.out.print(a[0]);
		return 0;
	}
}

