package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int length;
	   int length1;
	   int length2;
	   String a = new String(new char[50]);
	   String b = new String(new char[50]);
	   int sum = 0;
	   int n = 0;
	   int i;
	   int j;
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
	   length1 = a.length();
	   length2 = b.length();
	   if (length1 != length2)
	   {
		   System.out.print("NO");
	   }
	   else
	   {
		   length = length1;
	   for (i = 0;i < length;i++)
	   {
		   for (j = 0;j < length;j++)
		   {
			   if (a.charAt(i) == b.charAt(j))
			   {
				   n++;
			   b = tangible.StringFunctions.changeCharacter(b, j, '0');
			   break;
			   }
		   }
			sum++;
	   }
		if (n == sum)
		{
		   System.out.print("YES");
		}
	   else
	   {
		   System.out.print("NO");
	   }
	   }
		return 0;
	}

}

