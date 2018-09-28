package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int t;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < t;i++)
	   {
		   int[] a = new int[256];
		   int len;
		   int m = 0;
		   String c = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(a,0,(Integer.SIZE / Byte.SIZE));
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c = tempVar2.charAt(0);
		   }
		   len = c.length();
		   for (j = 0;j < len;j++)
		   {
			   a[c.charAt(j)]++;
		   }
		   for (j = 'a';j < 'z';j++)
		   {
		   if (a[j] == 1)
		   {
			   m++;
		   }
		   }
			if (m == 0)
			{
			   System.out.print("no");
			   return 0;
			}
		   for (j = 0;j < len;j++)
		   {
			   if (a[c.charAt(j)] == 1)
			   {
					   System.out.printf("%c\n",c.charAt(j));
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					   goto loop;
			   }
		   }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		   loop:
		   continue;
	   }
	}
}

