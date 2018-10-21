package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int n;
		String q = new String(new char[100]);
		int[] p = new int[100];
		int[] t = new int[100];
		String s = new String(new char[100]);
		s = tangible.StringFunctions.changeCharacter(s, 0, System.in.read());
		t[0] = s.charAt(0);
		while ((s[i] = System.in.read()) != '\n')
		{
			   t[i] = s.charAt(i);
			   p[i - 1] = t[i] + t[i - 1];
			   i++;
		}
		n = i;
		p[n - 1] = t[0] + t[n - 1];
		for (int j = 0;j < n;j++)
		{
		   System.out.print(p[j]);
		}
		return 0;
	}
}

