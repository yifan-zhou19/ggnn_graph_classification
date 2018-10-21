package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int i;
	   int l1;
	   int l2;
	   int j;
	   int k;
	   int s = 1;
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   String c = new String(new char[100]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = tempVar3.charAt(0);
		 }

	  for (l1 = a.length() - 1,l2 = b.length() - 1,j = 0;l2 >= 0;l1--,l2--)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(l1) - b.charAt(l2));
		  j++;
	  }
	  for (l1 = a.length() - b.length() - 1;l1 >= 0;l1--)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(l1) - 48);
		  j++;
	  }
	  for (k = 0;k < j;k++)
	  {
		  if (c.charAt(k) < 0)
		  {
			  c = tangible.StringFunctions.changeCharacter(c, k, 10 + c.charAt(k));
			  c.charAt(k + 1)--;
		  }
	  }
	  for (k = j - 1;k >= 0;k--)
	  {
		  if (c.charAt(k) != 0)
		  {
			  for (l2 = k;l2 > 0;l2--)
			  {
		  System.out.printf("%d",c.charAt(l2));
			  }
		  System.out.printf("%d\n",c.charAt(0));
		  break;
		  }
	  }
	  for (l1 = j - 1;l1 >= 0;l1--)
	  {
		  if (c.charAt(l1) != 0)
		  {
			  s = 1;
	   break;
		  }
	  else
	  {
		  s = 0;
	  }
	  }
	  if (s == 0)
	  {
		  System.out.print("0\n");
	  }
	 }
	}

}

