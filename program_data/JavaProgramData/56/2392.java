package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char a;
	  char b;
	  char c;
	  char d;
	  char e;
	  a = b = c = d = e = 0;
	  String tempVar = ConsoleInput.scanfRead(null, 1);
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar3 != null)
	  {
		  c = tempVar3.charAt(0);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar4 != null)
	  {
		  d = tempVar4.charAt(0);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar5 != null)
	  {
		  e = tempVar5.charAt(0);
	  }
	  if (e != '\n' && e)
	  {
		System.out.print(e);
	  }
	  if (d != '\n' && d)
	  {
		System.out.print(d);
	  }
	  if (c != '\n' && c)
	  {
		System.out.print(c);
	  }
	  if (b != '\n' && b)
	  {
		System.out.print(b);
	  }
	  System.out.print(a);
	}
}

