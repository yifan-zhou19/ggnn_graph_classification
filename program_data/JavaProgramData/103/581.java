package <missing>;

public class GlobalMembers
{
	public static char f(char x)
	{

		 if (x >= 'a')
		 {
		 return x - 'a'+'A';
		 }
		 else
		 {
		 return x;
		 }
	}
	public static int Main()
	{
	int a;
	int b;
	int i;
	String str = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	a = f(str.charAt(0));
	b = 1;

	for (i = 1; i < str.length(); i++)
	{
		  if (a == f(str.charAt(i)))
		  {
		  b++;
		  }
		  else
		  {
			  System.out.printf("(%c,%d)",a,b);
			  a = f(str.charAt(i));
			  b = 1;
		  }
	}
	System.out.printf("(%c,%d)",a,b);


	}

}

