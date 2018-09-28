package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String a;
	   int i;
	   int n = 0;
	   int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
	   int b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   a = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		  for (i = 0;i < 30;i++)
		  {
		   *(a.Substring(i)) = '\0';
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   a.Substring(i) = Integer.parseInt(tempVar);
		   }
		  }

	   for (i = 0; * (a.Substring(i)) != '\0';i++)
	   {
			if (*(a.Substring(i)) < ':' && *(a.Substring(i))>'/')
			{
		 System.out.printf("%c",*(a.Substring(i)));
			}
				if (*(a.Substring(i)) >= ':' || *(a.Substring(i)) <= '/' && *(a.Substring(i) + 1) < ':' && *(a.Substring(i) + 1)>'/')
				{
					  System.out.print("\n");
				}
	   }




	}

}

