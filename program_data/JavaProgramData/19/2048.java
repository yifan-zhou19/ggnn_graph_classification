package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[1000]);
		char[][] s = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int j = 0;
		int k = 0;
		int d;
		w = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		while (w.charAt(i) != '\0')
		{
		   while (w.charAt(i) != ' ' && w.charAt(i) != '\0')
		   {
			  s[j][k] = w.charAt(i);
			  i++;
			  k++;
		   }
		   s[j][k] = '\0';
		   j++;

		   k = 0;
		   while (w.charAt(i) == ' ')
		   {
			  i++;
		   }
		}

	  for (i = 0;i < j;i++)
	  {
		   d = strcmp(s[i],a);
		   if (d == 0)
		   {
			  s[i] = b;
		   }
	  }
		System.out.printf("%s",s[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %s",s[i]);
		}
	return 0;
	}
}
