package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String string = new String(new char[257]);
	 String sub = new String(new char[257]);
	 String re = new String(new char[257]);
	 final String out = "";
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 String = tempVar;
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 sub = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 re = tempVar3.charAt(0);
	 }
	 int i;
	 int k = 0;
	 int len;
	 int m = 0;
	 len = sub.length();
	 int len2 = re.length();
	 int len3 = String.length();
	 for (i = 0;i < 256;i++)
	 {
	  if (String[i] == sub.charAt(k))
	  {
	   k += 1;
	   if (k == len)
	   {
		   break;
	   }
	  }
	   else
	   {
		k = 0;
	   }
	 }
					   if (k == len)
					   {
						int s = len3 - len + len2;
						for (int j = 0;j < s;j++)
						{
						 if (j <= i - k)
						 {
							 out = tangible.StringFunctions.changeCharacter(out, j, string.charAt(j));
							 continue;
						 }
						 if (j > i - k && j <= i - k + len2)
						 {
							 out = tangible.StringFunctions.changeCharacter(out, j, re.charAt(m));
							 m += 1;
						 }
						 else
						 {
							 out = tangible.StringFunctions.changeCharacter(out, j, string.charAt(i + 1));
							 i++;
						 }
						}
						 System.out.printf("%s",out);
					   }
						else
						{
						System.out.printf("%s",String);
						}

	}

}

