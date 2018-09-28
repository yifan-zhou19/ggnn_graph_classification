package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int len;
		int j = 0;
		int n;
		String p = new String(new char[199]);
		String q = new String(new char[100]);
		p = new Scanner(System.in).nextLine();
		len = p.length();
		for (i = 1;i <= len;i++)
		{
		if (p.charAt(len - i) != ' ' && (i != len))
		{
			q = tangible.StringFunctions.changeCharacter(q, j, p.charAt(len - i),j++);
		}
		 else if (i != len)
		 {
		for (n = 0;n < j;n++)
		{
		System.out.printf("%c",q.charAt(j - 1 - n)),q[j - 1 - n] = 0;
		}
		j = 0;
		System.out.print(" ");
		 }
	else
	{
		q = tangible.StringFunctions.changeCharacter(q, j, p.charAt(len - i),j++);
		for (n = 0;n < j;n++)
		{
		System.out.printf("%c",q.charAt(j - 1 - n)),q[j - 1 - n] = 0;
		}
	}
		}
	}
}

