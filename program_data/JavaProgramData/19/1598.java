import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		String d = new String(new char[20]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i = 0;
		int n = 0;
		int j = 0;
		int k;
		int l = 0;
		for (;a.charAt(i) != 0;)
		{
			if (a.charAt(i) == 32)
			{
				i++;
			}
			for (;a.charAt(i) != 32 && a.charAt(i) != 0;i++, n++)
			{
				d = tangible.StringFunctions.changeCharacter(d, n, a.charAt(i)); //?a?????d
			}
			d = d.substring(0, n);
			if (strcmp(b,d) == 0)
			{ //??a????b??
				for (j = i - n;n > 0;n--)
				{
					for (k = j;a.charAt(k) != 0;k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1)); //??a???
					}
				}
				for (;c.charAt(l) != 0;l++,j++)
				{
					for (k = j;a.charAt(k) != 0;k++)
					{
						;
					}
					for (;k >= j;k--)
					{
						a = tangible.StringFunctions.changeCharacter(a, k + 1, a.charAt(k));
					}
					a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(l)); //?c?????
				}
				l = 0;
				i = j;
			}
			else
			{
				n = 0;
			}
		}
		System.out.print(a);
	}
}

