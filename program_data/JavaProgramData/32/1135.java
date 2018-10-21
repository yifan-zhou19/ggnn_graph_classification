package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[105]);
	public static String b = new String(new char[105]);
	public static String c = new String(new char[105]);
	public static void minus(int l1,int l2)
	{
		 int i;
		 int j;
	   for (i = 0;i < l2;i++)
	   {
		   if (b.charAt(i) >= c.charAt(i))
		   {
			  b.charAt(i) -= c.charAt(i);
		   }
			else
			{
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 10 - c.charAt(i));
			  j = i + 1;
			  b.charAt(j)--;
			  while (b.charAt(j) < 0)
			  {
				b.charAt(j) += 10;
				  j++;
				b.charAt(j)--;
			  }
			}
	   }

	}
	public static int Main()
	{
		int n;
		int i;
		int max;
		int j;
		int l1;
		int l2;
		char m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a = tempVar2.charAt(0);
			   }
			   l1 = a.length();
			   String tempVar3 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar3 != null)
			   {
				   m = tempVar3.charAt(0);
			   }
			   for (j = 0;j < l1;j++)
			   {
				  b = tangible.StringFunctions.changeCharacter(b, l1 - j - 1, a.charAt(j) - '0');
			   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				 memset(a,0,(Character.SIZE / Byte.SIZE));
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   a = tempVar4.charAt(0);
			   }
			   String tempVar5 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar5 != null)
			   {
				   m = tempVar5.charAt(0);
			   }
				l2 = a.length();
			   for (j = 0;j < l2;j++)
			   {
				  c = tangible.StringFunctions.changeCharacter(c, l2 - j - 1, a.charAt(j) - '0');
			   }
			   minus(l1, l2);
			  while (!b.charAt(l1 - 1))
			  {
				 l1--;
			  }
			for (j = l1 - 1;j >= 0;j--)
			{
			   System.out.printf("%d",b.charAt(j));
			}
			System.out.print("\n");
	   }


		return 0;
	}
}

