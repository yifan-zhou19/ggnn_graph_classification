package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int l;
		  int[] d = new int[1000];
		  int k = 0;
		  String a = new String(new char[1000]);
		  String c = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  for (i = 0;i < l;i++)
		  {
			   if (a.charAt(i) >= 'a')
			   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			   }
			   if (i == 0)
			   {
			   c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i));
			   d[k] = 1;
			   }
			   else
			   {
				   if (a.charAt(i) == a.charAt(i - 1))
				   {
				   d[k]++;
				   }
				   if (a.charAt(i) != a.charAt(i - 1))
				   {
					   k++;
					   d[k] = 1;
					   c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i));
				   }
			   }
		  }
		  for (i = 0;i <= k;i++)
		  {
			  System.out.printf("(%c,%d)",c.charAt(i),d[i]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

