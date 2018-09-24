package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double len;
		double len1;
		double h;
		double n1;
		int i;
		int f;
		int r;
		h = 0;
		f = 0;
		String s = new String(new char[500]);
		String t = new String(new char[500]);
		String n = new String(new char[2]);
		n = new Scanner(System.in).nextLine();
		n1 = Double.parseDouble(n);
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		len = s.length();
		len1 = t.length();
		if (len != len1)
		{
		System.out.print("error");
		}
		else
		{
			for (i = 0;i < len;i++)
			{
			  if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G') || (t.charAt(i) != 'A' && t.charAt(i) != 'T' && t.charAt(i) != 'C' && t.charAt(i) != 'G'))
			  {
			  f = 1;
			  }
			}
			if (f != 0)
			{
			System.out.print("error");
			}
			else
			{
			for (i = 0;i < len;i++)
			{
			  if (s.charAt(i) == t.charAt(i))
			  {
			  h++;
			  }
			}
			if (h / len > n1)
			{
			System.out.print("yes");
			}
			else
			{
			System.out.print("no");
			}
			}
		}
			return 0;
	}
}
