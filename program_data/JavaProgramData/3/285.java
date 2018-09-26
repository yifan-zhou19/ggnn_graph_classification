package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int i;
	   int[] m = new int[1000];
	   int a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (m[i]) = Integer.parseInt(tempVar3);
		   }
		   for (a = 0;a < i;a++)
		   {
			   if (k == m[a] + m[i])
			   {
				   System.out.print("yes\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				   goto abc;
			   }
		   }
	   }
	   System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	abc:
	return 0;
	}

}

