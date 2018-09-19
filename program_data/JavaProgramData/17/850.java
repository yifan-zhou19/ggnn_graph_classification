package <missing>;

public class GlobalMembers
{
	public static int a;
	public static String s1 = new String(new char[101]);
	public static String s2 = new String(new char[101]);
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 0;l < n;l++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(s1,0,101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(s2,0,101);
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s1 = tempVar2.charAt(0);
			 }
			 a = s1.length();
			 int[] k = new int[100];
			 int b = 0;
			 for (i = 0;i < a;i++)
			 {
				  if (s1.charAt(i) == '(')
				  {
				  for (j = i;j < a;j++)
				  {
					  if (s1.charAt(j) == '(')
					  {
						  k[i]++;
					  }
					  else if (s1.charAt(j) == ')')
					  {
						  k[i]--;
					  }
				  }
				  }
			 }
			 for (i = a - 1;i >= 0;i--)
			 {
				  if (s1.charAt(i) == ')')
				  {
				  for (j = i;j >= 0;j--)
				  {
					  if (s1.charAt(j) == ')')
					  {
						  k[i]++;
					  }
					  else if (s1.charAt(j) == '(')
					  {
						  k[i]--;
					  }
				  }
				  }
			 }
			 for (i = 0;i < a;i++)
			 {
				if (s1.charAt(i) == ')')
				{
					 b = 0;
					 for (j = i - 1;j >= 0;j--)
					 {
						 if (s1.charAt(j) == ')' && k[j] > 0)
						 {
							 b++;
						 }
					 }
					 k[i] -= b;
				}
			 }
			 for (i = a - 1;i >= 0;i--)
			 {
				 if (s1.charAt(i) == '(')
				 {
					  b = 0;
					  for (j = i + 1;j < a;j++)
					  {
						  if (s1.charAt(j) == '(' && k[j] > 0)
						  {
							  b++;
						  }
					  }
					  k[i] -= b;
				 }
			 }
			 for (i = 0;i < a;i++)
			 {
				 if (k[i] > 0)
				 {
					 if (s1.charAt(i) == '(')
					 {
						 s2 = tangible.StringFunctions.changeCharacter(s2, i, '$');
					 }
					 else if (s1.charAt(i) == ')')
					 {
						 s2 = tangible.StringFunctions.changeCharacter(s2, i, '?');
					 }
				 }
				 else
				 {
					 s2 = tangible.StringFunctions.changeCharacter(s2, i, ' ');
				 }
			 }
			 System.out.printf("%s\n",s1);
			 for (i = 0;i < a;i++)
			 {
				 System.out.printf("%c",s2.charAt(i));
			 }
			 System.out.print("\n");
		}
	}

}

