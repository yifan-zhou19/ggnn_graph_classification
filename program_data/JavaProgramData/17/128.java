import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int j;
		while (str = new Scanner(System.in).nextLine())
		{
			int length = str.length();
			int[] count1 = new int[1000];
			int[] count2 = new int[1000];
			for (i = length; i >= 0; i--)
			{
				if (str.charAt(i) == '(')
				{
					for (j = i; str.charAt(j) != '\0'; j++)
					{
						if (str.charAt(j) == ')' && count2[j] == 0)
						{
							count2[j]--;
							break;
						}
						else
						{
							if (str.charAt(j + 1) == '\0')
							{
								count1[i]++;
							}
						}
					}
				}
			}
			for (i = 0; str.charAt(i) != '\0'; i++)
			{
				if (str.charAt(i) == ')')
				{
					count2[i]++;
				}
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; str.charAt(i) != '\0'; i++)
			{
				if (count1[i] == 1)
				{
					System.out.print("$");
				}
				if (count2[i] == 1)
				{
					System.out.print("?");
				}
				if (count1[i] != 1 && count2[i] != 1)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
