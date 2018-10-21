package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 1;i <= n;i++)
	  {
		String zfc = new String(new char[21]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		if ((zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z') || zfc.charAt(0) == '_')
		{
		  int s;
		  for (int k = 1;zfc.charAt(k) != '\0';k++)
		  {
			if ((zfc.charAt(k) >= 'a' && zfc.charAt(k) <= 'z') || (zfc.charAt(k) >= 'A' && zfc.charAt(k) <= 'Z') || zfc.charAt(k) == '_' || (zfc.charAt(k) >= '0' && zfc.charAt(k) <= '9'))
			{
			  s = 0;
			}
			else
			{
			  s = 1;
			  break;
			}
		  }
		  if (s == 0)
		  {
			System.out.print("yes\n");
		  }
		  else if (s == 1)
		  {
			System.out.print("no\n");
		  }
		}
		else
		{
		   System.out.print("no\n");
		}
	  }
	  return 0;
	}
}

