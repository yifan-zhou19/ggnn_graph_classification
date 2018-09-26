package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[300]);
	   String b = new String(new char[300]);
	   String c = new String(new char[300]);
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
	   int a1;
	   int b1;
	   int c1;
	   int i;
	   int j;
	   int k;
	   a1 = a.length();
		b1 = b.length();
		 c1 = c.length();
		 for (i = 0;i <= a1 - 1;i++)
		 {
			   for (j = 0;j <= b1 - 1;j++)
			   {
					if (a.charAt(i + j) != b.charAt(j))
					{
						break;
					}
			   }
				 if (j == b1)
				 {
					 break;
				 }
		 }

	if (i >= a1)
	{
		System.out.printf("%s",a);
	}
	else
	{
		 for (k = 0;k < i;k++)
		 {
				System.out.printf("%c",a.charAt(k));
		 }
		 System.out.printf("%s",c);
		 for (k = i + b1;k <= a1 - 1;k++)
		 {
		 System.out.printf("%c",a.charAt(k));
		 }
	}
	}
}

