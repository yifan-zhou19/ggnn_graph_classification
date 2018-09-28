package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  char ch;
	  String s = new String(new char[100]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (;k != 0;k--)
	  {
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		if ((ch > 47) && (ch < 58))
		{
		  while (ch != '\n')
		  {
			  String tempVar3 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar3 != null)
			  {
				  ch = tempVar3.charAt(0);
			  }
		  }
		  System.out.print("0\n");
		}
		else
		{
		  while (ch != '\n')
		  {
			if ((ch != '_') && ((ch < 48) || ((ch>57) && (ch < 65)) || ((ch>90) && (ch < 97)) || (ch>122)))
			{
			  while (ch != '\n')
			  {
				  String tempVar4 = ConsoleInput.scanfRead(null, 1);
				  if (tempVar4 != null)
				  {
					  ch = tempVar4.charAt(0);
				  }
			  }
			  ch = ' ';
			  System.out.print("0\n");
			  break;
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				ch = tempVar5.charAt(0);
			}
		  }
		  if (ch == '\n')
		  {
			System.out.print("1\n");
		  }
		}
	  }
	}

}

