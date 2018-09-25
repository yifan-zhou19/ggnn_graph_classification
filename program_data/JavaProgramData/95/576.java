package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int[] c = new int[100];
	int[] d = new int[100];
	int sumc = 0;
	int sumd = 0;
	int lena;
	int lenb;
	int i;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	lena = a.length();
	lenb = b.length();
	for (i = 0;i < lena;i++)
	{
		   c[i] = a.charAt(i);
		d[i] = b.charAt(i);
		if (c[i] > 64 && c[i] < 91)
		{
			c[i] = c[i] + 32;
		}
		else if (d[i] > 64 && d[i] < 91)
		{
			d[i] = d[i] + 32;
		}
		sumc = sumc + c[i];
		sumd = sumd + d[i];
	}
	if (sumc > sumd)
	{
	 System.out.print(">");
	}
	else if (sumc < sumd)
	{
	 System.out.print("<");
	}
	else if (sumc == sumd)
	{
	 System.out.print("=");
	}
	}

}
