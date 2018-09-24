package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t = 0;
		int b = 0;
		String s = new String(new char[80]);
		String s0 = new String(new char[80]);
		final String s1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			   if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			   {
				   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			   }
			 for (j = 0;j < 36;j++)
			 {
				 if (s1.charAt(j) == s.charAt(i))
				 {
			   t = n * t + j;
				 }
			 }
		}
	   for (i = 0;;i++)
	   {
			s0 = tangible.StringFunctions.changeCharacter(s0, i, s1.charAt(t % m));
			b++;
			t = t / m;
			if (t == 0)
			{
				break;
			}
	   }
	   for (i = b - 1;i >= 0;i--)
	   {
		   System.out.printf("%c",s0.charAt(i));
	   }
		System.out.print("\0");
		return 0;
	}


}

