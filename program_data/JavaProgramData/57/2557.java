package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int s;
		int i;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m <= n - 1;m++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 s = a.length();
		 for (i = 0;i <= s - 1;i++)
		 {
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(s - 1 - i));
		 }
		  k = s - 3;
		  if ((b.charAt(2) == 'i') && (b.charAt(1) == 'n'))
		  {
		  k = s - 4;
		  }
		  for (i = 0;i <= k;i++)
		  {
		  System.out.printf("%c",a.charAt(i));
		  }
		  System.out.print("\n");
		}
	}
}

