package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	int c;
	int i;
	int c1;
	int c2;
	int d = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	c = a.length() - 1;
	for (i = 0;i <= c;i++)
	{
	  c1 = a.charAt(i);
	  c2 = a.charAt(i + 1);
	  if (c1 > 90)
	  {
		  c1 = c1 - 32;
	  }
	  if (c2 > 90)
	  {
		  c2 = c2 - 32;
	  }
	  if (c1 == c2)
	  {
		  d++;
	  }
	  else
	  {
	  System.out.printf("(%c,%d)",c1,d);
	  d = 1;
	  }
	}
	return 0;
	}
}

