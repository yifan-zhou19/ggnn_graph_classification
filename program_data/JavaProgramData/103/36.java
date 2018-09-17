package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  int n;
		  int i;
		  int x;
		  int count;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  n = a.length();
		  for (i = 0;i < n;i++)
		  {
			   if (a.charAt(i) > 'Z')
			   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			   }
		  }
		  for (i = 0,count = 0,x = a.charAt(0);i < n;i++)
		  {
			   if (a.charAt(i) == x)
			   {
				   count++;
			   }
			   else
			   {
				   System.out.printf("(%c,%d)",x,count);
				   count = 1;
				   x = a.charAt(i);
			   }
			   if (i == n - 1)
			   {
			   System.out.printf("(%c,%d)",x,count);
			   }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}

