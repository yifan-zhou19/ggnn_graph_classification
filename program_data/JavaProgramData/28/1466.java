import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[30000]);
	str = new Scanner(System.in).nextLine();
	int num = 1;
	int i = 0;
	int j = 0;
	while (str.charAt(i) != '\0')
	{
		if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ')
		{
			if (j == 0)
			{
				System.out.print(num);
				j++;
			}
			else
			{
				System.out.print(',');
				System.out.print(num);
			}
			num = 0;
		}
		i++;
		if (str.charAt(i) != ' ')
		{
			num++;
		}
	}
	if (j == 0)
	{
		System.out.print(num - 1);
		System.out.print("\n");
	}
	else
	{
		System.out.print(',');
		System.out.print(num - 1);
		System.out.print("\n");
	}
	return 0;
	}
}
