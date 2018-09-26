package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		int sum = 0;
		int i;
		int j;
		int k;
		int n;
		int m;
		int h = 0;
		int y = 0;
		a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		n = a.length();
		m = b.length();
		k = c.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
						for (j = 0;j < m;j++)
						{
				  if (b.charAt(j) == a.charAt(i + j))
				  {
				   sum++;
				  }
						} //?????????????????????
			   if (sum == m && y == 0)
			   {
					  for (j = 0;j < k;j++)
					  {
						  d = tangible.StringFunctions.changeCharacter(d, h + j, c.charAt(j));
					  }
				  i = i + m;
				  h = h + k;
				  y = 1;
			   }
			   sum = 0;
			}
		d = tangible.StringFunctions.changeCharacter(d, h, a.charAt(i));
		h++;
		}
		d = tangible.StringFunctions.changeCharacter(d, h, '\0');
		System.out.printf("%s\n",d);
		return 0;
	}
}

