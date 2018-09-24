import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[200]);
		int len;
		int len1;
		int len2;
		int i;
		int j;
		int temp;
		int judge = 0;
		c = new Scanner(System.in).nextLine();
		len = c.length();
		len1 = (len - 1) / 2;
		len2 = len1;
		for (i = 0;i < len1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i));
		}
		for (i = 0;i < len2;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, c.charAt(len - 1 - i));
		}
		for (i = 0;i < len1 - 1;i++)
		{
			for (j = 0;j < len1 - 1 - i;j++)
			{
				if (a.charAt(j) < a.charAt(j + 1))
				{
					temp = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, temp);
				}
			}
		}
		for (i = 0;i < len1 - 1;i++)
		{
				for (j = 0;j < len1 - 1 - i;j++)
				{
					if (b.charAt(j) < b.charAt(j + 1))
					{
						temp = b.charAt(j);
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
						b = tangible.StringFunctions.changeCharacter(b, j + 1, temp);
					}
				}
		}
		for (i = 0;i < len1;i++)
		{
			if (a.charAt(i) != b.charAt(i))
			{
				judge++;
			}
		}
		if (judge == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

