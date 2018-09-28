package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int result;
	   int i;
	   String zfc = new String(new char[21]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n-- != 0)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 zfc = tempVar2.charAt(0);
		 }
		 if ((zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z') || (zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) == '_'))
		 {
		   for (i = 1;zfc.charAt(i) != '\0';i++)
		   {
			  if ((zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z') || (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z') || (zfc.charAt(i) == '_') || (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9'))
			  {
				  result = 1;
			  }
			  else
			  {
				  result = 0;
				  break;
			  }
		   }
		 }
		 else
		 {
			result = 0;
		 }
		 if (result == 1)
		 {
			System.out.print("yes\n");
		 }
		 else
		 {
			System.out.print("no\n");
		 }
	   }
	   return 0;
	}
}

