package <missing>;

public class GlobalMembers
{
	public static int fscan(tangible.RefObject<Integer> n)
	{
	 char c;
	 n.argValue = null;
	 do
	 {
		c = System.in.read();
		if (c == '\n')
		{
			return 0;
		}
		if (c != ',')
		{
		   n.argValue = n.argValue * 10 + c - '0';
		}
	 }while (c != ',');
	 return 1;
	}


	public static int Main()
	{
		int n;
		int first = -1;
		int second = -1;
		int temp;
	tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
		temp = fscan(tempRef_n);
		n = tempRef_n.argValue;
		first = n;
		while (temp != 0)
		{
		  tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n);
			  temp = fscan(tempRef_n2);
			  n = tempRef_n2.argValue;
			  if (n > first)
			  {
				 second = first;
				 first = n;
			  }
			  else if (n > second && n != first)
			  {
					 second = n;
			  }
		}
	   if (second == -1)
	   {
		   System.out.print("No");
	   }
	   else
	   {
		   System.out.printf("%d",second);
	   }
	   return 1;
	}

}

