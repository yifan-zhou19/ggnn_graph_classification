package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		  do
		  {
		  if (i % 2 == 1 && i != 1)
		  {
		  i = 3 * i + 1,System.out.printf("%d*3+1=%d\n",(i - 1) / 3,i);
		  }
		  else if (i % 2 == 0)
		  {
		  i = i / 2,System.out.printf("%d/2=%d\n",2 * i,i);
		  }
		  else
		  {
		  ;
		  }
		  }while (i != 1);
		  System.out.print("End");
	}

}

