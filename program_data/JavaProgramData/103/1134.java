public class point
{
	public int x;
	public char y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1100]);
		int i;
		int j;
		int n;
		int b = 0;
		point[] dian = tangible.Arrays.initializeWithDefaultpointInstances(27);
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) >= 'a')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
			}
		}
		dian[0].y = c.charAt(0);
		j = 0;
		dian[0].x = 1;
		for (i = 1;i < n;i++)
		{
			if (c.charAt(i) == c.charAt(i - 1))
			{
				dian[j].x += 1;
			}
			else
			{
				j++;
				dian[j].y = c.charAt(i);
				dian[j].x = 1;
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("(%c,%d)",dian[i].y,dian[i].x);
		}
		return 0;
	}

}

