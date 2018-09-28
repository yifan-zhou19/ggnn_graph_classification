import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char girl;
	public static int Main()
	{
		void Match(char queue[], int p);
		String queue = new String(new char[100 + 10]);
		queue = new Scanner(System.in).nextLine();
		girl = queue.charAt(queue.length() - 1);
		Match(queue, 0);
		return 0;
	}

	public static void Match(String queue, int p)
	{
		int q = p;
		do
		{
			q++;
		} while (queue[q].equals(0));
		if (queue[q].equals(girl))
		{
			System.out.print(p);
			System.out.print(" ");
			System.out.print(q);
			System.out.print("\n");
			queue[p] = null;
			queue[q] = null;
			do
			{
				p--;
				if (p < 0)
				{
					break;
				}
			} while (queue[p].equals(0));
			if (p >= 0)
			{
				Match(queue, p);
			}
		}
		else
		{
			Match(queue, q);
		}
	}
}
