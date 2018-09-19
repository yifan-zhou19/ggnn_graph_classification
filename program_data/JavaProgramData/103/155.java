package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String l = new String(new char[1000]);
		  int i;
		  int count = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  l = tempVar.charAt(0);
		  }
		  for (i = 0;l.charAt(i) != '\0';i++)
		  {
							  if ((l.charAt(i + 1) == l.charAt(i)) || (l.charAt(i + 1) == l.charAt(i) + 32) || (l.charAt(i + 1) == l.charAt(i) - 32))
							  {
							  count = count + 1;
							  }
							  else
							  {
								  if (l.charAt(i) >= 'a' && l.charAt(i) <= 'z')
								  {
									System.out.printf("(%c,%d)",l.charAt(i) - 32,count);
									count = 1;
								  }
								  else
								  {
									System.out.printf("(%c,%d)",l.charAt(i),count);
									count = 1;
								  }
							  }
		  }
		  return 0;
	}


}

