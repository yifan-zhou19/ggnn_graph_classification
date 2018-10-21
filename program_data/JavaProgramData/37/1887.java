package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 int[] a = new int[100001];
		 String s = new String(new char[100001]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			  int x = 0;
			  for (j = 0;j < 100001;j++)
			  {
				  s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				  a[j] = 1;
			  }
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
			  for (j = 0;j < 100001;j++)
			  {
				   if (a[j] == 1)
				   {
					   for (k = j + 1;k < 100001;k++)
					   {
						   if (s.charAt(j) == s.charAt(k))
						   {
						   a[j]++;
						   a[k]++;
						   }
					   }
				   }
			  }
			  for (j = 0;j < 100001;j++)
			  {
				  if (a[j] == 1)
				  {
				  System.out.printf("%c\n",s.charAt(j));
				  x = 1;
				  break;
				  }
			  }
			  if (x == 0)
			  {
				  System.out.print("no\n");
			  }
		 }

	}


}

