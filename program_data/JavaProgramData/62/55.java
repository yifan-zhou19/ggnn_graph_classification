import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[101]);
		x = new Scanner(System.in).nextLine();
		int i;
		int n1;
		int j;
		n1 = x.length();
		for (i = 0; i < n1; i++)
		{
			if (x.charAt(i) == ' ')
			{
				int count = 0;
				for (j = i + 1; j < n1; j++)
				{
					if (x.charAt(j) == ' ')
					{
						count++;
					}
					else
					{
						break;
					}
				}
				x.Substring(i) = x.Substring(i) + count;
				n1 = n1 - count;
			}
		}
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}

}
