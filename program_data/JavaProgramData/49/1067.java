package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[500]);
	int x;
	int y;
	int i;
	int j;
	int k;
	int l;
	int m;
	int p = 0;
	c = new Scanner(System.in).nextLine();
	String a = new String(new char[500]);
	a = c;
	for (i = 0;;i++)
	{
	if (c.charAt(i) == '\0')
	{
		break;
	}
	}

	for (k = 1;k < i;k++)
	{
		for (j = 0;c.charAt(k + j) != '\0';j++)
		{
		p = 0;
		c = a;
	x = c.charAt(j);
	y = c.charAt(k + j);
		if (x != y)
		{
			p = 1;
		}

		else
		{
			for (l = 1;x == y;l++)
			{
		   x = c.charAt(j + l);
	   y = c.charAt(k + j - l);
	   if (x != y)
	   {
		   p = 1;
		   break;
	   }
	   else if (j + l >= k + j - l)
	   {
		   break;
	   }
			}
		}
	   if (p == 0)
	   {
		   for (m = j;m <= k + j;m++)
		   {
		   System.out.printf("%c",c.charAt(m));

		   }
		   System.out.print("\n");
	   }
		}
	}
	return 0;
	}
}
