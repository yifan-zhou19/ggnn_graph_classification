public class words
{
	 public int len;
	 public String word = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int size;
	   int count = 0;
	   words a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	   a = (words)malloc(sizeof(words) * n);
	   for (i = 0;i < n;i++)
	   {
		   size = 0;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (a + i).word = tempVar2.charAt(0);
		   }
		   for (size = 0;(a + i).word.charAt(size) != '\0';size++)
		   {
			   ;
		   }
		   (a + i).len = size;
	   }
		count = 0;
		for (i = 0;i < n;i++)
		{
			 if (count + (a + i).len + 1 > 80)
			 {
				 System.out.print("\n");
				 count = 0;
				 i--;
			 }
			 else
			 {
				if (count == 0)
				{
					System.out.printf("%s",(a + i).word);
					count = count + (a + i).len;
				}
				else
				{
					System.out.printf(" %s",(a + i).word);
					count = count + (a + i).len + 1;
				}
			 }
		}
	}

}

