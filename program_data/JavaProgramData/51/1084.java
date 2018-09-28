package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int len;
		 int[] a = new int[500];
		 int i0 = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 0;i < 500;i++)
		 {
			 a[i] = 0;
		 }
		 String s = new String(new char[500]);
		 String s1 = new String(new char[500]);
		 String s2 = new String(new char[500]);
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s = tempVar2.charAt(0);
		 }
		 len = s.length();
		 for (int i = 0;i <= len - n;i++)
		 {
			  for (int j = 0;j < n;j++)
			  {
				  s1 = tangible.StringFunctions.changeCharacter(s1, j, s.charAt(i + j));
			  }
			  s1 = tangible.StringFunctions.changeCharacter(s1, n, '\0');
			  for (int j = i;j <= len - n;j++)
			  {
				   for (int k = 0;k < n;k++)
				   {
					   s2 = tangible.StringFunctions.changeCharacter(s2, k, s.charAt(j + k));
				   }
				   s2 = tangible.StringFunctions.changeCharacter(s2, n, '\0');
				   /*printf("%s %s\n",s1,s2);*/
				   if (strcmp(s1,s2) == 0)
				   {
					   a[i]++;
				   }
			  }
		 }
		 /*for(int i=0;i<=len-n;i++) printf("%d\n",a[i]);*/
		 for (int i = 0;i <= len - n;i++)
		 {
			  if (a[i] > a[i0])
			  {
				  i0 = i;
			  }
		 }
		 if (a[i0] == 1)
		 {
			 System.out.print("NO");
		 }
		 else
		 {
			 System.out.printf("%d\n",a[i0]);
			  for (int i = 0;i <= len - n;i++)
			  {
				   if (a[i] == a[i0])
				   {
						for (int j = 0;j < n;j++)
						{
							 if (j < n - 1)
							 {
								 System.out.printf("%c",s.charAt(i + j));
							 }
							 else
							 {
								 System.out.printf("%c\n",s.charAt(i + j));
							 }
						}
				   }
			  }
		 }

	}

}

