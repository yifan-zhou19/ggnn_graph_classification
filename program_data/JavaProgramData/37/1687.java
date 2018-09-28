package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[100000]);
		  int m;
		  int i;
		  int j;
		  int t;
		  int[] b = new int[150];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= m;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(b,0,(Integer.SIZE / Byte.SIZE));
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  j = 0;
		  while (c.charAt(j) != 0)
		  {
						b[c.charAt(j)]++;
						j++;
		  }
		  for (t = 0;t < j;t++)
		  {
					   if (b[c.charAt(t)] == 1)
					   {
					   System.out.printf("%c\n",c.charAt(t));
					   break;
					   }
					   if (b[c.charAt(j - 1)] != 1 && t == j - 1)
					   {
					   System.out.printf("%c%c\n",'n','o');
					   }
		  }
		  }

	}




}

