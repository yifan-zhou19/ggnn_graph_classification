package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[100]);
		char[][] word = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String[] p = new String[100];
		String p1;
		String p2;
		int i;
		int j;
		int k;
		int strl;
		int al;
		int bl;
		String = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p1 = a;
		p2 = b;
		strl = String.length();
		al = a.length();
		bl = b.length();
		j = 0;
		k = 0;
		for (i = 0;i < strl;i++)
		{
		   if (String[i] != 32)
		   {
				word[j][k] = string.charAt(i);
				if (String[i + 1] != 32)
				{
					k++;
				}
				else if (String[i + 1] == 32 || string.charAt(i + 1) == '\0')
				{
					word[j][k + 1] = '\0';
					k = 0;
					j++;
				}
		   }
		}
		for (i = 0;i < j + 1;i++)
		{
			p[i] = word[i];
		}
		for (i = 0;i < j + 1;i++)
		{
			if (strcmp(p1,p[i]) == 0)
			{
				p[i] = p2;
			}
		}
		 for (i = 0;i < j;i++)
		 {
		   System.out.printf("%s ",p[i]);
		 }
		System.out.printf("%s",p[j]);
	}

}
