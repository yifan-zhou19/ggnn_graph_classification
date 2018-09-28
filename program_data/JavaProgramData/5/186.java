import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String b = new String(new char[501]);
		String c = new String(new char[501]);
		int i;
		int j;
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int flag = 0;
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				System.out.print("error");
				System.out.print("\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
		for (j = 0;c.charAt(j) != '\0';j++)
		{
			if (c.charAt(j) != 'A' && c.charAt(j) != 'T' && c.charAt(j) != 'C' && c.charAt(j) != 'G')
			{
				System.out.print("error");
				System.out.print("\n");
				flag = 1;
				break;
			}
		}
		}
		if (flag == 0)
		{
			if (i != j)
			{
				System.out.print("error");
				System.out.print("\n");
				flag = 1;
			}
		}
		int t = 0;
		if (flag == 0)
		{
			for (i = 0;i < j;i++)
			{
			   if (b.charAt(i) == c.charAt(i))
			   {
				   t++;
			   }
			}
		double k = (double)t / j;
		if (k > a)
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}
		}
		return 0;

	}
}

