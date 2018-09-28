import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void Inverse(String a)
	{
		int len = a.length();
		for (int i = 0;i < len / 2;i++)
		{
			char temp;
			temp = a[i];
			a[i] = a[len - 1 - i];
			a[len - 1 - i] = temp;
		}
	}
	public static int Main()
	{
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			System.in.read();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			Inverse(a);
			Inverse(b);
			int j;
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) >= b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j) + '0');
				}
				else
				{
					a.charAt(j + 1)--;
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j) + '0');
				}
			}
			while (a.charAt(j) < '0' && a.charAt(j) != '\0')
			{
				a.charAt(j + 1)--;
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j) + '0');
			}
			Inverse(a);
			j = 0;
			while (a.charAt(j) == '0')
			{
				j++;
			}
			while (a.charAt(j) != '\0')
			{
			  System.out.print(a.charAt(j++));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

