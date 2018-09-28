package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String x = new String(new char[50]);
	   String y = new String(new char[50]);
	   int i;
	   for (i = 0;i < 50;i++)
	   {
	   String tempVar = ConsoleInput.scanfRead(null, 1);
	   if (tempVar != null)
	   {
		   x = tangible.StringFunctions.changeCharacter(x, i, tempVar);
	   }
	   if (x.charAt(i) == 32)
	   {
	   break;
	   }
	   }
	   for (i = 0;i < 50;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   y = tangible.StringFunctions.changeCharacter(y, i, tempVar2);
	   }
	   if (y.charAt(i) == 32)
	   {
	   break;
	   }
	   }
	   int m = x.length();
	   int a = 0;
	   for (i = 0;i < 50;i++)
	   {
		  if (y.charAt(i) == x.charAt(0))
		  {
			  a = i;
		break;
		  }
	   }
	   System.out.printf("%d",a);
	   return 0;
	}
}

