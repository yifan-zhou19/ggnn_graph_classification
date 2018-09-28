package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
	int[] ai = new int[128];
	final String ia = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String s = new String(new char[100]);
	final String s2 = "0";
	char c;
	int n = 0;


	 for (i = '0';i <= '9';i++)
	 {
			ai[i] = i - '0';
	 }
	  for (i = 'A';i <= 'Z';i++)
	  {
			ai[i] = i - 'A' + 10;
	  }
	   for (i = 'a';i <= 'z';i++)
	   {
			ai[i] = i - 'a' + 10;
	   }

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b = Integer.parseInt(tempVar3);
	   }
	  for (i = 0;s.charAt(i) != '\0';i++)
	  {
		  n = a * n + ai[s.charAt(i)];
	  }

	  for (i = 0;n != 0;i++)
	  {
			 s2 = tangible.StringFunctions.changeCharacter(s2, i, ia.charAt(n % b));
		   n = n / b;
	  }

	  for (j = 0;j < (i + 1) / 2;j++)
	  {
			c = s2.charAt(j);
			s2 = tangible.StringFunctions.changeCharacter(s2, j, s2.charAt(i - 1 - j));
			s2 = tangible.StringFunctions.changeCharacter(s2, i - 1 - j, c);
	  }

	   System.out.println(s2);
	   return 0;
	}
}

