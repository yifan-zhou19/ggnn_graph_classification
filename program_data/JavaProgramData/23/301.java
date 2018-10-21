import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char t;
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int l;
		int w = 1;
		b[0] = 0;
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != 32 && a.charAt(i - 1) == 32)
			{
				b[w] = i;
				w++;
			}
		}
		b[w] = i + 1;
		for (k = 0;k < w;k++)
		{
			for (l = b[k];l < (b[k + 1] + b[k] - 1) / 2;l++)
			{
				t = a.charAt(l);
				a = tangible.StringFunctions.changeCharacter(a, l, a.charAt(b[k + 1] + b[k] - 2 - l));
				a = tangible.StringFunctions.changeCharacter(a, b[k + 1] + b[k] - 2 - l, t);
			}
		}

		for (j = 0;j < i / 2;j++)
		{
			t = a.charAt(j);
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(i - 1 - j));
			a = tangible.StringFunctions.changeCharacter(a, i - 1 - j, t);
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

