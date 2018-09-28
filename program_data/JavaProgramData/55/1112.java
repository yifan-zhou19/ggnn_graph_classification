package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 String n = new String(new char[40]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
			 int l = n.length();
			 int[] m = new int[40];
			 int x = 0;

				 for (int i = 0;i < l;i++)
				 {
								 if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
								 {
								 n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A'+'a');
								 }
								 if (n.charAt(i) <= 'z' && n.charAt(i) >= 'a')
								 {
								 m[i] = n.charAt(i) - 'a' + 10;
								 }
								 else
								 {
									 m[i] = n.charAt(i) - '0';
								 }
								 int d = m[i];
								 x = x * a + d;
				 }
			   if (x == 0)
			   {
			   System.out.print("0");
			   }
			   else
			   {
			 int[] e = new int[40];
			 int k;
			 for (k = 0;x != 0;k++)
			 {
					 e[k] = x % b;
				 x = x / b;

			 }
				 e[k] = '\0';
			 String f = new String(new char[40]);
			 int j;
					   for (j = 0;j < k;j++)
					   {
					  if (e[j] >= 0 && e[j] < 10)
					  {
					  f = tangible.StringFunctions.changeCharacter(f, k - j - 1, e[j] + '0');
					  }
					  else
					  {
					  f = tangible.StringFunctions.changeCharacter(f, k - j - 1, e[j] - 10 + 'A');
					  }
					   }
			 f = tangible.StringFunctions.changeCharacter(f, k, '\0');
	 System.out.printf("%s",f);
			   }
	 System.in.read();
	 System.in.read();

	}

}

