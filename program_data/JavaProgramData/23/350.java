import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			j = i;
		}
		for (i = 0;i <= j;i++)
		{
			if (str.charAt(i) == ' ')
			{
				l = l + 1;
			}
		}
		if (l != 0)
		{
			for (i = j - 1;i >= 0;i--)
			{
				if (str.charAt(i) == ' ')
				{
					for (k = i + 1;k <= j;k++)
					{
						System.out.print(str.charAt(k));
					}
					j = i;
					break;
				}
			}
			for (i = j - 1;i >= 0;i--)
			{
				if (str.charAt(i) == ' ')
				{
					System.out.print(" ");
					for (k = i + 1;k < j;k++)
					{
						System.out.print(str.charAt(k));
					}
					j = i;
				}
			}
			System.out.print(" ");
			for (i = 0;str.charAt(i) != ' ';i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		  if (l == 0)
		  {
			for (i = 0;i <= j;i++)
			{
				System.out.print(str.charAt(i));
			}
		  }

		return 0;
	}

}
