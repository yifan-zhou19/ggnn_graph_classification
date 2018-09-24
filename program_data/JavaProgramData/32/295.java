package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] c = new char[100][100];
		int n;
		int i;
		int j;
		int k;
		int l1;
		int l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			l1 = a.length();
			l2 = b.length();
		   for (j = l1 - 1,k = l2 - 1;k >= 0;j--,k--)
		   {
			   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(k) + '0');
			   if (a.charAt(j) < '0')
			   {
				   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10);
				   a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
			   }
		   }
			c[i] = a;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
	}
}

