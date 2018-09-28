package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void leave(String a);
	public static int Main()
	{
	   String children = new String(new char[1000000]);
	   char boy;
	   char girl;
	   children = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   int i = 0;
	   int n = children.length();
	   for (i = 0;;i++)
	   {
		   boy = children.charAt(0);
		   if (children.charAt(i) != boy)
		   {
			   girl = children.charAt(i);
			   break;
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (children.charAt(i) == boy)
		   {
			   continue;
		   }
		   for (int j = i;j >= 0;j--)
		   {
			   if (children.charAt(j) == boy)
			   {
				   System.out.print(j);
				   System.out.print(" ");
				   System.out.print(i);
				   System.out.print("\n");
				   children = children.substring(0, j);
				   break;
			   }
		   }
	   }
	   return 0;
	}

}

