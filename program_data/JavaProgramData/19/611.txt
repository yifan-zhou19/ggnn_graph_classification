import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		char[][] word = new char[50][15];
		int i = 0;
		int n;
		int j = 0;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = str.length();
		while (i < n)
		{
			while (str.charAt(i) != ' ')
			{
				word[j][k++] = str.charAt(i++);
			}
			word[j][k] = '\0';
			k = 0;
			j++;
			i++;
		}
		for (i = 0;i < j - 1;i++)
		{
			if (strcmp(a,word[i]) == 0)
			{
				System.out.print(b);
				System.out.print(" ");
			}
			else
			{
				System.out.print(word[i]);
				System.out.print(" ");
			}
		}

		if (strcmp(a,word[i]) == 0)
		{
			System.out.print(b);
			System.out.print("\n");
		}
		else
		{
			System.out.print(word[i]);
			System.out.print("\n");
		}

			return 0;
	}


}
