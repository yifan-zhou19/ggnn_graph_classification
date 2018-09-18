package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d;
		String e;
		String f;
		int al;
		int bl;
		int cl;
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		al = a.length();
		bl = b.length();
		cl = c.length();
		d = a.charAt(0);
		e = b.charAt(0);
		f = c.charAt(0);

			for (i = 0;i < al;i++)
			{
			for (j = 0, k = i;(*(d.Substring(i) - 1) == ' ' || i == 0) && j < bl && *(d.Substring(k)) == *(e.Substring(j));j++, k++)
			{
			}
			if (j == bl)
			{
				break;
			}
			}
			if (j != bl)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto line;
			}

		for (j = 0;j < al - bl - i;j++)
		{
			*(d.Substring(i) + j) = *(d.Substring(i) + j + bl);
		}
		al = al - bl;
		for (j = al - 1;j >= i;j--)
		{
			*(d.Substring(j) + cl) = *(d.Substring(j));
		}
		for (j = i,k = 0;j < cl + i;j++,k++)
		{
			*(d.Substring(j)) = *(f.Substring(k));
		}
		al = al + cl;
		*(d.Substring(al)) = '\0';



		for (i = i + cl;i < al;i++)
		{
			for (j = 0, k = i;(*(d.Substring(i) - 1) == ' ' || i == 0) && j < bl && *(d.Substring(k)) == *(e.Substring(j));j++, k++)
			{
			}
			if (j == bl)
			{
				break;
			}
		}
		if (j != bl)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto line;
		}
		for (j = 0;j < al - bl - i;j++)
		{
			*(d.Substring(i) + j) = *(d.Substring(i) + j + bl);
		}
		al = al - bl;
		for (j = al - 1;j >= i;j--)
		{
			*(d.Substring(j) + cl) = *(d.Substring(j));
		}
		for (j = i,k = 0;j < cl + i;j++,k++)
		{
			*(d.Substring(j)) = *(f.Substring(k));
		}
		al = al + cl;
		*(d.Substring(al)) = '\0';

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	line:
	System.out.println(a);

	}

}
