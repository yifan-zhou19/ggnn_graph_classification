package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String aa = new String(new char[20]);
		String bb = new String(new char[10]);
		char c;
		int i;
		while ((aa = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (bb = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		   i = 0;
		   c = aa.charAt(0);
		   while (aa.charAt(i) != '\0')
		   {
			 if (aa.charAt(i) > c)
			 {
			  c = aa.charAt(i);
			 }
		   i++;
		   }
		   i = 0;
		   while (aa.charAt(i) != '\0')
		   {
			  if (aa.charAt(i) == c)
			  {
				   break;
			  }
			   System.out.print(aa.charAt(i));
				i++;
		   }
				System.out.print(aa.charAt(i));
				System.out.print(bb);
				i++;
				while (aa.charAt(i) != '\0')
				{
				   System.out.print(aa.charAt(i));
				   i++;
				}
				   System.out.print("\n");
		}
						return 0;
	}

}

