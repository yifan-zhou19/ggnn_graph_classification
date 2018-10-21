package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int n;
		int j;
		int c;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 0;j < n;j++)
		{
				c = 0;
			a = 0;
			String s = new String(new char[21]);
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(0) == 95 || (s.charAt(0) <= 122 && s.charAt(0) >= 97) || (s.charAt(0) <= 90 && s.charAt(0) >= 65))
			{
					c++;
			}
				   a++;
			 if (s.charAt(i) == 95 || (s.charAt(i) <= 122 && s.charAt(i) >= 97) || (s.charAt(i) <= 90 && s.charAt(i) >= 65) || (s.charAt(i) <= 57 && s.charAt(i) >= 48))
			 {
				 c++;
			 }
				 a++;

		}

		if (c == a)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		}


		return 0;
	}


}

