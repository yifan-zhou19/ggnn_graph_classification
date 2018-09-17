package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int l;
		int i;
		int num = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		 if ((s.charAt(l - 1) - s.charAt(l - 2) == 0) || (s.charAt(l - 1) - s.charAt(l)) == ('a'-'A') || (s.charAt(l - 1) - s.charAt(l - 2)) == ('A'-'a'))
		 {
		  for (i = 0;i < l;i++)
		  {
			  if ((s.charAt(i + 1) - s.charAt(i) == 0) || (s.charAt(i + 1) - s.charAt(i)) == ('a'-'A') || (s.charAt(i + 1) - s.charAt(i)) == ('A'-'a'))
			  {
				  num++;
			  }
			  else
			  {
					if (s.charAt(i) - 'a' >= 0)
					{
				  System.out.printf("(%c,%d)",s.charAt(i) - 32,num);
					}
				  else
				  {
				  System.out.printf("(%c,%d)",s.charAt(i),num);
				  }
				  num = 1;
			  }
		  }
		 }
		 else
		 {
			  for (i = 0;i < l - 1;i++)
			  {
			  if ((s.charAt(i + 1) - s.charAt(i) == 0) || (s.charAt(i + 1) - s.charAt(i)) == ('a'-'A') || (s.charAt(i + 1) - s.charAt(i)) == ('A'-'a'))
			  {
				  num++;
			  }
			  else
			  {
					if (s.charAt(i) - 'a' >= 0)
					{
				  System.out.printf("(%c,%d)",s.charAt(i) - 32,num);
					}
				  else
				  {
				  System.out.printf("(%c,%d)",s.charAt(i),num);
				  }
				  num = 1;
			  }
			  }
		  if (s.charAt(l - 1) - 'a' >= 0)
		  {
				  System.out.printf("(%c,1)",s.charAt(l - 1) - 32);
		  }
				  else
				  {
				  System.out.printf("(%c,1)",s.charAt(l - 1));
				  }
		 }
		  System.in.read();
		  System.in.read();
	}

}

