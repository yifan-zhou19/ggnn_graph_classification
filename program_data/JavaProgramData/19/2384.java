package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char[][] words = new char[100][100];
		String ti = new String(new char[100]);
		String bt = new String(new char[100]);
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[200];
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ti = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bt = tempVar2.charAt(0);
		}
		n = 0;
		k = 0;
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				words[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (s.Substring(k));
		n++;
		for (i = 0;i < n;i++)
		{
		   if (strcmp(ti,words[i]) == 0)
		   {
			   words[i] = bt;
		   }

		}

		 for (i = 0;i < n;i++)
		 {
		   if (i == 0)
		   {
		   System.out.printf("%s",words[0]);
		   }
		   else
		   {
		   System.out.printf(" %s",words[i]);
		   }
		 }

		 return 0;
	}
}

