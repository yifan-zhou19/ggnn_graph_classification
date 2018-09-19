package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		String c = new String(new char[2000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = a.length();
		int i;
		int j = 1;
		int k = 0;
		int[] b = new int[2000];
		for (i = 0;i < l - 1;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1) || (a.charAt(i) - a.charAt(i + 1) == 32) || (a.charAt(i) - a.charAt(i + 1) == -32))
			{
			j++;
			}
			else
			{
				b[k] = j;
				c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i));
				k++;
				j = 1;
			}
		}
			c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(l - 1));
			b[k] = j;
		for (i = 0;i <= k;i++)
		{
				if (c.charAt(i) <= 'Z')
				{
				System.out.print("(");
				System.out.print(c.charAt(i));
				System.out.print(",");
				System.out.print(b[i]);
				System.out.print(")");
				}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
				System.out.print("(");
				System.out.print(c.charAt(i));
				System.out.print(",");
				System.out.print(b[i]);
				System.out.print(")");
			}
		}
	}

}

