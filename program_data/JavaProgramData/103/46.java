package <missing>;

public class GlobalMembers
{
	public static void c(tangible.RefObject<String> p, int l)
	{
		 int i;

		for (i = 0;i < l;i++)
		{
		if ((*(p.argValue.Substring(i))) >= 'a' && (*(p.argValue.Substring(i))) <= 'z')
		{
		*(p.argValue.Substring(i)) = *(p.argValue.Substring(i)) + ('A'-'a');
		}
		}

	}
	public static int f(char x,char y)
	{

		if (x == y)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int l;
	int e;
	int count = 0;
		  String a = new String(new char[1000]);
		  String p;
		  char q;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  p = a;
	  tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
		  c(tempRef_p, l);
		  p = tempRef_p.argValue;
		  for (i = 0;i < l;i++)
		  {
	if (l == 1)
	{
	 System.out.printf("(%s,1)",a);
	}
		  if (i == 0)
		  {
		  q = a.charAt(i);
		  count++;
		  }
		  else
		  {
			  if (i != (l - 1))
			  {
			  e = f(q, a.charAt(i));
			  if (e == 0)
			  {
			  System.out.printf("(%c,%d)",q,count);
			  q = a.charAt(i);
			  count = 1;
			  }
			  else
			  {
			  count++;
			  }
			  }
		  else
		  {
		  if (q == a.charAt(l - 1))
		  {
		   System.out.printf("(%c,%d)",q,(count + 1));
		  }
		   else
		   {
		   System.out.printf("(%c,%d)",q,count);
			System.out.printf("(%c,1)",a.charAt(l - 1));
		   }
		  }
		  }
		  }
						  System.out.print("\n");
						  System.in.read();
						  System.in.read();
						  System.in.read();
	}

}

