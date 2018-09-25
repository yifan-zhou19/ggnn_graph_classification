package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 int sum = 0;
		 String s = new String(new char[1001]);
		 char c;
		 for (i = 0;i < 1001;i++)
		 {
			 s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 for (i = 0;s.charAt(i) != '\0';)
		 {
			  k = 0;
			  for (j = i;j < 1001;j++)
			  {
				   if (s.charAt(i) == s.charAt(j) || s.charAt(i) == s.charAt(j) + 32 || s.charAt(i) == s.charAt(j) - 32)
				   {
					   k++;
				   }
				   else if (s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(j) + 32 && s.charAt(i) != s.charAt(j) - 32)
				   {
						System.out.printf("(%c,%d)", (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')?(s.charAt(i) - 32):s.charAt(i), k);
						sum = sum + k;
						i = sum;
						break;
				   }
			  }
		 }

	}




}

