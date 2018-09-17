package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i = 0;
		int j = 0;
		int k;
		int count = 1;
		while (a.charAt(i) != '\0')
		{
		 if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		 {
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			 j++;
		 }
		 else
		 {
			 j++;
		 }
		 i++;
		}
	   for (k = 0;k < i;k++)
	   {
		   if (a.charAt(k) == a.charAt(k + 1))
		   {
			   count++;
		   }
		   else
		   {
			System.out.printf("(%c,%d)",a.charAt(k) - 32,count);
			count = 1;
		   }
	   }
	}
}

