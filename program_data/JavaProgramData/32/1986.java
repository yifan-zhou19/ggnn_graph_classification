package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String st1 = new String(new char[10000]);
	  String st2 = new String(new char[10000]);
	  int n;
	  int[] re = new int[10000];
	  int k;
	  int l1;
	  int l2;
	  int i;
	  int j;
	  int y;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (k = 1;k <= n;k++)
	  {
		 scanf("\n");
	   st1 = new Scanner(System.in).nextLine();
	   st2 = new Scanner(System.in).nextLine();
	   l1 = st1.length();
	   l2 = st2.length();
	   j = l1 - l2;
	   for (i = l2 - 1;i >= 0;i--)
	   {
		st2 = tangible.StringFunctions.changeCharacter(st2, i + j, st2.charAt(i));
	   }
	   for (i = 0;i <= j - 1;i++)
	   {
		st2 = tangible.StringFunctions.changeCharacter(st2, i, '0');
	   }
	   for (i = l1 - 1;i >= 0;i--)
	   {
		  if (st1.charAt(i) >= st2.charAt(i))
		  {
			re[i] = st1.charAt(i) - st2.charAt(i);
		  }
		  else
		  {
			 re[i] = st1.charAt(i) + 10 - st2.charAt(i);
			 st1 = tangible.StringFunctions.changeCharacter(st1, i - 1, st1.charAt(i - 1) - 1);
		  }
	   }
		y = 0;
		if (re[0] == 0)
		{
		for (i = 0;i < l1;i++)
		{
			 re[i] = re[i + 1];
		  y = 1;
		}
		}
	   if (y == 1)
	   {
		   for (i = 0;i < l1 - 1;i++)
		   {
		 System.out.printf("%d",re[i]);
		   }
		System.out.print("\n");
	   }
	   else
	   {
		   for (i = 0;i < l1;i++)
		   {
		 System.out.printf("%d",re[i]);
		   }
	   System.out.print("\n");
	   }
	  }
	}


}

