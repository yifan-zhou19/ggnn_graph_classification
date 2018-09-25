public class word
{
	public char a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static word[] w = tangible.Arrays.initializeWithDefaultwordInstances(1000);

	public static int Main()
	{
		int i;
		int k;
		int num = 0;
		int temp;
		int t = 0;
		String c = new String(new char[1111]);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = c.length();
		for (i = 0;i < k;i++)
		{
			if (c.charAt(i) >= 'a')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
			}
		}
		i = 0;
		temp = c.charAt(0);
		while (i < k)
		{
			if (c.charAt(i) == temp)
			{
				num++;
			}
			if (c.charAt(i) != temp)
			{
				w[t].a = c.charAt(i - 1);
				w[t].b = num;
				num = 1;
				temp = c.charAt(i);
				t++;
			}
			i++;
		}
		w[t].a = c.charAt(i - 1);
		w[t].b = num;
		for (i = 0;i <= t;i++)
		{
			System.out.print('(');
			System.out.print(w[i].a);
			System.out.print(',');
			System.out.print(w[i].b);
			System.out.print(')');
		}
		return 0;
	}
}

