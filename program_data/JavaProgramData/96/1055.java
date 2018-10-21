package <missing>;

public class GlobalMembers
{
	public static int con13(int x,int y)
	{
		int n = (10 * x + y) / 13;
		return (n);
	}
	public static int rem13(int x,int y)
	{
		int n = (10 * x + y) % 13;
		return (n);
	}
	public static int Main()
	{
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		c = new Scanner(System.in).nextLine();
		int i = 0;
		while (c.charAt(i) != '\0')
		{
		c.charAt(i) -= '0';
		i++;
		}
		if (i == 1)
		{
		   System.out.printf("%d\n",0);
		   System.out.printf("%d",c.charAt(0));
		}
		else
		{
		  if (i == 2 && c.charAt(0) == 1 && c.charAt(1) < 3)
		  {
		  System.out.printf("%d\n",0);
		  System.out.printf("%d",rem13(c.charAt(0), c.charAt(1)));
		  }
		else
		{
		int rem = rem13(c.charAt(0), c.charAt(1));
		d = tangible.StringFunctions.changeCharacter(d, 0, con13(c.charAt(0), c.charAt(1)));
		if (d.charAt(0) != null)
		{
		System.out.printf("%d",d.charAt(0));
		}
		for (int j = 2;j < i;j++)
		{
		d = tangible.StringFunctions.changeCharacter(d, j - 1, con13(rem, c.charAt(j)));
		rem = rem13(rem, c.charAt(j));
		System.out.printf("%d",d.charAt(j - 1));
		}
		System.out.print("\n");
		System.out.printf("%d",rem);
		}
		}
	}
}

