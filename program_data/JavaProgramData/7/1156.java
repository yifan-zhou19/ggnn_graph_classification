package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
	 String b = new String(new char[256]);
	 String c = new String(new char[256]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c = tempVar3.charAt(0);
	 }
	 int sum1 = b.length();
	 int i;
	 int j;
	 int k;
	 int m;
	 int n;
	 int p;
	 int q;
	 int start;
	 int pd = 0;
	  for (start = 0;start < a.length();start++)
	  {
		   k = 0;
		   for (i = start;i < start + sum1;i++)
		   {
			 if (a.charAt(i) != b.charAt(k))
			 {
				 break;
			 }
			 k++;
		   }
		   if (i == (start + sum1))
		   {
			   pd = 1;
			   p = start;
			   break;
		   }
	  }

	  if (pd == 1)
	  {
			for (q = p,k = 0;c.charAt(k) != '\0';q++,k++)
			{
		  a = tangible.StringFunctions.changeCharacter(a, q, c.charAt(k));
			}
	  }
	 System.out.printf("%s",a);

	}

}

