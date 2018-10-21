import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		int i = 0;
		int min = 20;
		int max = 0;
		int mini;
		int maxi;
		int l = 0;
		for (i = 0; i <= len; i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				l++;
			}
			else if (a.charAt(i - 1) != ' ' && a.charAt(i - 1) != ',' && a.charAt(i - 1) != '\0')
			{
				if (min > l)
				{
					min = l;
					mini = i;
				}
				if (max < l)
				{
					max = l;
					maxi = i;
				}
				l = 0;
			}
		}
		for (i = maxi - max; i < maxi; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		for (i = mini - min; i < mini; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}
