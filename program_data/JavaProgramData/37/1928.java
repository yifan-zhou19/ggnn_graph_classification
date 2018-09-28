package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int j;
		  int[] k = new int[26];
		  int x;
		  String c = new String(new char[10000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(k,0,(Integer.SIZE / Byte.SIZE));
			x = c.length();
			for (j = 0;j < x;j++)
			{
							 k[c.charAt(j) - 'a']++;
			}
			for (j = 0;j < x;j++)
			{
			  if (k[c.charAt(j) - 'a'] == 1)
			  {
				  System.out.printf("%c\n",c.charAt(j));
			  break;
			  }
			  if (j == x - 1)
			  {
			  System.out.print("no\n");
			  }
			}
		  }

	}

}

