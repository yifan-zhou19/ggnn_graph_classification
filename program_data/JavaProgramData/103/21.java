package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int count = 0;
		  int j;
		  int l;
		  String string = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  String = tempVar;
		  }
		  l = String.length();
		  for (i = 0;i < l;i++)
		  {
				if (String[i] >= 'a' && string.charAt(i) <= 'z')
				{
				 String[i] = string.charAt(i) - 'a'+'A';
				}
		  }
		  char s;
		  s = string.charAt(0);
		  for (i = 0;i < l;i++)
		  {
			  if (String[i] == s)
			  {
				 count++;
			  }
			  else
			  {
				 System.out.printf("(%c,%d)",s,count);
				 s = string.charAt(i);
				 count = 1;
			  }
		  }
		  System.out.printf("(%c,%d)",s,count);
		  System.in.read();
		  System.in.read();
	}

}

