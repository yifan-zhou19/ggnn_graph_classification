import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] o = new int[31];
		String b = new String(new char[31]);
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 30;i++)
		{
			o[i] = (b.Substring(i));
			if (o[i] >= 48 && o[i] <= 57)
			{
				System.out.print((b.Substring(i)));
			}
			else if ((o[i] < 48 || o[i]>57) && (o[(i - 1)] >= 48 && o[(i - 1)] <= 57))
			{
				System.out.print("\n");
			}
		}

		return 0;
	}
}
