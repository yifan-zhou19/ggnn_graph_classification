package <missing>;

public class GlobalMembers
{
	public static void echo()
	{
		char c1;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		if (c1 != '\n')
		{
		echo();
		}
		System.out.printf("%c",c1);
	}
	   public static int Main()
	   {
		   echo();
	   }
}

