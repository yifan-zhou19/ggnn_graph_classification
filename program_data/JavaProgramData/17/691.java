import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int k = 0;
		String s = new String(new char[105]);
		while (s = new Scanner(System.in).nextLine())
		{
			int[] zuo = new int[100];
			int[] you = new int[100];
			int[] flag = new int[105];
			String a = new String(new char[105]);
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			m = 0;
			n = 0;
			for (j = 0;j < i;j++)
			{
				if (s.charAt(j) == '(')
				{
					zuo[m++] = j;
				}
				if (s.charAt(j) == ')')
				{
					you[n++] = j;
				}
			}
			for (j = 0;j < n;j++)
			{
				for (k = you[j] - 1;k >= 0;k--)
				{
					if (s.charAt(k) == '(' && flag[k] == 0)
					{
						flag[k] = 1;
						flag[you[j]] = 1;
						break;
					}
				}
			}
			for (k = 0;k < i;k++)
			{
				if (flag[k] == 0 && s.charAt(k) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, k, '$');
				}
				if (flag[k] == 0 && s.charAt(k) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, k, '?');
				}
			}
			System.out.print(s);
			System.out.print("\n");
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}
}

