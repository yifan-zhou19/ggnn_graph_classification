import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int num = 1;
		int j;
		while (a = new Scanner(System.in).nextLine())
		{
			System.out.print(a);
			System.out.print("\n");
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				num = 1;
				if (a.charAt(i) != ')' && a.charAt(i) != '(')
				{
					System.out.print(" ");
				}
				if (a.charAt(i) == '(')
				{
					if (a.charAt(i + 1) == '\0')
					{
						System.out.print("$");
						continue;
					}
					for (j = i + 1;a.charAt(j) != '\0';j++)
					{
						if (a.charAt(j) == '(')
						{
							num++;
						}
						if (a.charAt(j) == ')')
						{
							num--;
						}
						if (num == 0)
						{
							System.out.print(" ");
							break;
						}
						if (a.charAt(j + 1) == '\0' && num != 0)
						{
							System.out.print("$");
						}
					}
				}
				num = 1;
				if (a.charAt(i) == ')')
				{
					if (i == 0)
					{
						System.out.print("?");
						continue;
					}
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == ')')
						{
							num++;
						}
						if (a.charAt(j) == '(')
						{
							num--;
						}
						if (num == 0)
						{
							System.out.print(" ");
							break;
						}
						if (j == 0 && num != 0)
						{
							System.out.print("?");
						}
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
