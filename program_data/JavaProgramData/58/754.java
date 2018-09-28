import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int judge(String a)
	{
		int j;
		int p = 1;
		int l;
		l = a.length();
		if (!((a[0].compareTo('a') >= 0 && a[0].compareTo('z') <= 0) || (a[0].compareTo('A') >= 0 && a[0].compareTo('Z') <= 0) || (a[0].equals('_'))))
		{
			return 0;
		}
		else
		{
			for (j = 1;j < l;j++)
			{
				if (!((a[j].compareTo('a') >= 0 && a[j].compareTo('z') <= 0) || (a[j].compareTo('A') >= 0 && a[j].compareTo('Z') <= 0) || (a[j].equals('_')) || (a[j].compareTo('0') >= 0 && a[j].compareTo('9') <= 0)))
				{
					p = 0;
					return 0;
				}
			}
				if (p == 1)
				{
					return 1;
				}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int r;
		String a = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			r = judge(a);
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}


}

