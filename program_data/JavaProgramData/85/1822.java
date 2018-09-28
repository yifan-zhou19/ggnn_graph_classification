package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int pd;
	 int j;
	 String zc = new String(new char[50]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  zc = tempVar2.charAt(0);
	  }
	  for (j = 0;j < zc.length();j++)
	  {
		  if (zc.charAt(0) > 47 && zc.charAt(0) < 58)
		  {
		   pd = 0;
		   break;

		  }

	  if ((zc.charAt(j) > 47 && zc.charAt(j) < 58) || (zc.charAt(j)>64 && zc.charAt(j) < 91) || (zc.charAt(j)>96 && zc.charAt(j) < 123) || (zc.charAt(j) == 95))
	  {

	  pd = 1;

	  }
	  else
	  {

	  pd = 0;

	  break;

	  }
	  }
	  if (pd == 1)
	  {
	 System.out.print("yes\n");
	  }
	  else if (pd == 0)
	  {
	System.out.print("no\n");
	  }

	 }
	 return 0;
	}
}

