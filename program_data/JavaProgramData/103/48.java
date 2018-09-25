package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String p = new String(new char[1001]);
	   char i = 0;
	   char count = 1;
	   int l;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p = tempVar.charAt(0);
	   }
	   l = p.length();
	   while (true)
	   {
			   if (l == 1)
			   {
				  if (p.charAt(0) >= 'A' && p.charAt(0) <= 'Z')
				  {
					   System.out.printf("(%c,%d)",p.charAt(0),count);
				  }
					else
					{
					  System.out.printf("(%c,%d)",p.charAt(0) - 'a'+'A',count);
					}
					break;
			   }
			   else if (p.charAt(i) == p.charAt(i + 1) || (p.charAt(i) - p.charAt(i + 1) == 'a'-'A') || (p.charAt(i) - p.charAt(i + 1) == 'A'-'a'))
			   {
				   count++;
				   i++;
			   }
			   else
			   {
					if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z')
					{
					   System.out.printf("(%c,%d)",p.charAt(i),count);
					}
					else
					{
					  System.out.printf("(%c,%d)",p.charAt(i) - 'a'+'A',count);
					}
					i++;
					count = 1;
			   }
			   if (i == l)
			   {
			   break;
			   }
	   }

	}

}

