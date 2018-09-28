package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int lengtha;
		int lengthb;
		int j;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a = tempVar2.charAt(0);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 b = tempVar3.charAt(0);
				 }
				 c = System.in.read();
				 lengtha = a.length();
				 lengthb = b.length();
				 for (j = lengthb - 1;j >= 0;j--)
				 {
						  if (a.charAt(lengtha - lengthb + j) < b.charAt(j))
						  {
						  a = tangible.StringFunctions.changeCharacter(a, lengtha - lengthb + j, '0' + 10 + a.charAt(lengtha - lengthb + j) - b.charAt(j));
						  a = tangible.StringFunctions.changeCharacter(a, lengtha - lengthb + j - 1, a.charAt(lengtha - lengthb + j - 1) - 1);
						  }
						  else
						  {
						  a = tangible.StringFunctions.changeCharacter(a, lengtha - lengthb + j, '0' + a.charAt(lengtha - lengthb + j) - b.charAt(j));
						  }
				 }
				 System.out.println(a);
		}
	}
}

