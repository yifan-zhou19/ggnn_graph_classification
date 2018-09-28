package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		int[] m = new int[1000];
		int[] n = new int[1000];
		int t;
		int s;
		int a;
		int b;
		int i;
		int j;
		int l1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l1 = s1.length();
		 for (i = 0;i < l1;i++)
		 {
			 if (s1.charAt(l1 - 1 - i) >= '0' && s1.charAt(l1 - 1 - i) <= '9')
			 {
				 m[i] = s1.charAt(l1 - i - 1) - '0';
			 }
			 else if (s1.charAt(l1 - 1 - i) >= 'a' && s1.charAt(l1 - 1 - i) <= 'z')
			 {
				 m[i] = s1.charAt(l1 - i - 1) - 'a' + 10;
			 }
			 else if (s1.charAt(l1 - 1 - i) >= 'A' && s1.charAt(l1 - 1 - i) <= 'Z')
			 {
				 m[i] = s1.charAt(l1 - i - 1) - 'A' + 10;
			 }
		 }
		 t = 1;
		 s = 0;
			for (i = 0;i < l1;i++)
			{
			   s += m[i] * t;
			t *= a;
			} //??????
		   i = 0;
		   if (s != 0)
		   {
		   while (s != 0)
		   {
			  n[i] = s % b;
			  s = s / b;
			  i++;
		   }
		  i--;
		   }
		  for (j = i;j >= 0;j--)
		  {
			  if (n[j] < 10)
			  {
				  s2 = tangible.StringFunctions.changeCharacter(s2, j, n[j] + '0');
				  System.out.printf("%c",s2.charAt(j));
			  }
			  else
			  {
				  s2 = tangible.StringFunctions.changeCharacter(s2, j, n[j] + 'A' - 10);
				  System.out.printf("%c",s2.charAt(j));
			  }
		  }

	}


}

