import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int min = INT_MAX; // max,min??????????????,n1,n2??????????????,n?????
		int max = INT_MIN;
		int n1;
		int n2;
		int i;
		int n = 0;
		final String a = "";
		a = new Scanner(System.in).nextLine();
		for (i = 0; a.charAt(i) != '\0'; i++) // ??????????
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				break;
			}
		}
		for (; a.charAt(i) != '\0'; i++) // ?????????????????????????
		{
			if (a.charAt(i) == ' ' || a.charAt(i) == ',')
			{
				min = n;
				max = n;
				n1 = i;
				n2 = i;
				n = 0;
				break;
			}
			else
			{
				n += 1;
			}
		}
		if (a.charAt(i) != 0)
		{
			i++;
		}
		for (; a.charAt(i) != '\0'; i++)
		{
			if ((a.charAt(i) == ' ' || a.charAt(i) == ',') && n != 0) // ?????????????????????
			{
				if (n > max)
				{
					max = n;
					n2 = i;
				}
				if (n < min)
				{
					min = n;
					n1 = i;
				}
				n = 0;
			}
			else if ((a.charAt(i) == ' ' || a.charAt(i) == ',') && n == 0) // ????????????
			{
				continue;
			}
			else
			{
				n += 1;
			}
		}
		if (n != 0) // ????????????????????????
		{
			if (n > max)
			{
				max = n;
				n2 = i;
			}
			if (n < min)
			{
				min = n;
				n1 = i;
			}
		}
		for (i = n2 - max; i < n2; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		for (i = n1 - min; i < n1; i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}
