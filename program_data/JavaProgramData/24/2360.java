import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int max = 0;
		int length;
		int len;
		int j;
		int min;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		min = 20;
		length = 0;
		for (i = 0; i <= len; i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				length += 1;
			}
			if (a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '\0')
			{
				if (length > max)
				{
					max = length;
				}
				if (length < min && length > 0)
				{
					min = length;
				}
				length = 0;
			}
		}
		length = 0;
		for (i = 0; i <= len; i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				length += 1;
			}
			if (a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '\0')
			{
				if (length == max)
				{
					for (j = i - max; j != i; j++)
					{
						System.out.print(a.charAt(j));
					}
					System.out.print("\n");
					break;
				}
				length = 0;
			}
		}
		length = 0;
		for (i = 0; i <= len; i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				length += 1;
			}
			if (a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '\0')
			{
				if (length == min)
				{
					for (j = i - min; j != i; j++)
					{
						System.out.print(a.charAt(j));
					}
					System.out.print("\n");
					break;
				}
				length = 0;
			}
		}

		return 0;
	}


}
