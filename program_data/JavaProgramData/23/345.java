import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100]);
		int i;
		int p = 0;
		int k = 0;
		int flag = 0;
		while (word = new Scanner(System.in).nextLine())
		{
			for (i = 0;i < 100;i++)
			{
				if (word.charAt(i) != '\0')
				{
					p = i;
				}
				else
				{
					break;
				}

			}
			for (i = 0;i <= p;i++)
			{
				if (word.charAt(i) == ' ')
				{
					flag = 1;
				}
			}
				if (flag == 0)
				{
					for (i = 0;i <= p;i++)
					{
						System.out.print(word.charAt(i));
					}
				}
				else
				{
				for (i = p;i >= 0;i--)
				{
				if (word.charAt(i) != ' ')
				{
					k++;
				}
				else
				{
					for (int j = i + 1;j <= i + k;j++)
					{
						System.out.print(word.charAt(j));
					}
					System.out.print(" ");
					k = 0;
				}
				}
			for (i = 0;i < 100;i++)
			{
				if (word.charAt(i) != ' ')
				{
					System.out.print(word.charAt(i));
				}
				else
				{
					break;
				}
			}
				}
		}
		return 0;

	}
}
