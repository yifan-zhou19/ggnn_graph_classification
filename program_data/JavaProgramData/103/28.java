package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  int t = 1;
		  for (int i = 0;i < l;i++)
		  {
				  if (a.charAt(i) == a.charAt(i + 1) || (a.charAt(i) + 'a'-'A') == (a.charAt(i + 1)) || (a.charAt(i) + 'A'-'a') == (a.charAt(i + 1)))
				  {
				  t++;
				  }
				  else
				  {
					  if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
					  {
					  System.out.printf("(%c,%d)",a.charAt(i),t);
					  }
					  else
					  {
					  System.out.printf("(%c,%d)",a.charAt(i) - 'a'+'A',t);
					  }
					  t = 1;
				  }
		  }
		  System.in.read();
		  System.in.read();

	}

}

