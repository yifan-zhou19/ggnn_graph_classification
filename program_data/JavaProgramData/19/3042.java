package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[300]);

		String = new Scanner(System.in).nextLine();
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

	   char[][] word = new char[200][200];
		int n1;
		int n2;
		int i;
		int k;
		int m = 0;
		int p = 0;
		n1 = String.length();
		for (i = 0;i < n1;i++)
		{
						 if (String[i] == ' ')
						 {
										 m++;
										 p = 0;
						 }
						 else
						 {
						 word[m][p] = string.charAt(i);
						 p++;
						 }

		}

		if (strcmp(word[0],a) == 0)
		{
		System.out.printf("%s", b);
		}
		else
		{
		System.out.printf("%s", word[0]);
		}

		for (k = 1;k <= m;k++)
		{
					   if (strcmp(word[k],a) == 0)
					   {
					   System.out.printf(" %s", b);
					   }
					   else
					   {
					   System.out.printf(" %s", word[k]);
					   }
		}

		return 0;
	}









}

