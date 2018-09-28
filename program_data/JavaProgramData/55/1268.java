package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int d = 0;
		int e;
		String h = new String(new char[25]);
		String n = new String(new char[20]);
		int[] s = new int[20];

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = n.length();
		for (i = 0;i <= c - 1;i++)
		{
			if (Character.isDigit(n.charAt(i)) != 0)
			{
				d = d + (n.charAt(i) - 48) * (int)Math.pow((double)a,c - 1 - i);
			}
			else if (Character.isLowerCase(n.charAt(i)) != 0)
			{
				d = d + (n.charAt(i) - 87) * (int)Math.pow((double)a,c - 1 - i);
			}
			else
			{
				d = d + (n.charAt(i) - 55) * (int)Math.pow((double)a,c - 1 - i);
			}

		}
	   for (i = 0;d >= b;i++)
	   {
		   if (d % b < 10)
		   {
			   h = tangible.StringFunctions.changeCharacter(h, i, d % b + 48);
		   }
		   else
		   {
			   h = tangible.StringFunctions.changeCharacter(h, i, d % b + 55);
		   }
		   d = d / b;
	   }
		  if (d < 10)
		  {
			  h = tangible.StringFunctions.changeCharacter(h, i, d + 48);
		  }
		  else
		  {
			  h = tangible.StringFunctions.changeCharacter(h, i, d + 55);
		  }
		  for (;i >= 0;i--)
		  {
			  System.out.print(h.charAt(i));
		  }

		return 0;

	}


}

