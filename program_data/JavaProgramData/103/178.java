package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int k;
	String a = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	for (i = 0;i < n;i++)
	{
	   if (a.charAt(i) < 'A' || a.charAt(i)>'Z')
	   {
	   a = tangible.StringFunctions.changeCharacter(a, i, 'A'-'a' + a.charAt(i));
	   }
	}
	for (i = 0;i < n;i++)
	{
	   k = 1;
	  while (a.charAt(i) == a.charAt(i + 1))
	  {
		   if (a.charAt(i) == a.charAt(i + 1))
		   {
		 k++;
		   }
		 i++;
	  }
		 System.out.printf("(%c,%d)",a.charAt(i),k);
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

