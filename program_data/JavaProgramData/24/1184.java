package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int y;
	   int z;
	   String m = new String(new char[100]);
	   String max = new String(new char[100]);
	   String min = new String(new char[100]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = tempVar.charAt(0);
	   }
	   y = z = m.length();
	   min = m;
	   max = m;
	   for (i = 1;i < 50;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = tempVar2.charAt(0);
		  }
		  if (y < m.length())
		  {
			  max = m;
			  y = m.length();
		  }
		  if (z > m.length())
		  {
			  min = m;
			  z = m.length();
		  }
	   }
	   System.out.printf("%s\n%s",max,min);
	   return 0;
	}
}

