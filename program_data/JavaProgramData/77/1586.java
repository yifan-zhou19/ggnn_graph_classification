import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int counter;
	public static int[] line = new int[100];
	public static void out(int l)
	{
		int record;
		if (counter == 0)
		{
			return;
		}
		for (int i = 0;i < l;i++)
		{
			if (line[i] == 1)
			{
				record = i;
				continue;
			}
			if (line[i] == 0)
			{
				line[record] = -1;
				line [i] = -1;
				System.out.print(record);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
				counter -= 2;
				out(l);
				break;
			}
		}
	}

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		char boy = a.charAt(0);
		int len = a.length();
		counter = len;
		for (int i = 0;i < len;i++)
		{
			if (a.charAt(i) == boy)
			{
				line[i] = 1;
			}
			else
			{
				line[i] = 0;
			}
		}
		out(len);
		return 0;
	}
}
