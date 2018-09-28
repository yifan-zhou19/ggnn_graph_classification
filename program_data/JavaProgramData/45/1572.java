package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String s1 = new String(new char[50]);
	   String s2 = new String(new char[50]);
	   int i;
	   int length;
	   int j = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s1 = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s2 = tempVar2.charAt(0);
	   }
	   length = s1.length();
	   for (i = 0;i < length;)
	   {
		   if (s1.charAt(i) != s2.charAt(j))
		   {
			   i = 0;
			   j++;
		   }
		   else
		   {
			   i++;
			   j++;
		   }
	   }
	   System.out.printf("%d",j - length);
	}
}

