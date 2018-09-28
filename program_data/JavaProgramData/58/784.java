import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int p(String st1)
	{
		int i;
		if (st1[0].compareTo(65) < 0 || (st1[0].compareTo(90) > 0 && st1[0].compareTo(95) < 0) || st1[0].equals(96) || st1[0].compareTo(122) > 0)
		{
			return 0;
		}
		for (i = 1;i < st1.length();i++)
		{
			if (st1[i].compareTo(48) < 0 || (st1[i].compareTo(57) > 0 && st1[i].compareTo(65) < 0) || (st1[i].compareTo(90) > 0 && st1[i].compareTo(95) < 0) || st1[i].equals(96) || st1[i].compareTo(122) > 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int n;
		String ch = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			ch = new Scanner(System.in).nextLine();
			System.out.print(p(ch));
			System.out.print("\n");
		}
		return 0;
	}
}

