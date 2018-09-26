package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
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
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
		   for (i = 0;i < m;i++)
		   {
			   k = 0;
			 for (j = i;j < m;j++)
			 {
				 if (b.charAt(j) == a.charAt(i))
				 {
					 c = b.charAt(j);
					 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
					 b = tangible.StringFunctions.changeCharacter(b, i, c);
					 k = 1;
					 break;
				 }
				 else
				 {
					 k = 0;
				 }
			 }
			 //printf("%d",k);

			 if (k == 0)
			 {
				 break;
			 }
		   }
		   if (k == 1)
		   {
			   System.out.print("YES");
		   }
		   else
		   {
			   System.out.print("NO");
		   }
		}
	}
}

