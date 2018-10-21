package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String A = new String(new char[250]);
		String B = new String(new char[250]);
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String p = new String(new char[250]);
		//char A[250]="12",B[250]="12345";
		//char a[250],b[250],p[250];
		int i;
		int j;
		int len1;
		int len2;
		int m = 0;
		int c;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			B = tempVar2.charAt(0);
		}
		len1 = A.length();
		len2 = B.length();
		max = (len1 > len2)?len1:len2;

		for (i = 0;i <= max;i++)
		{
			if (i < max - len1 + 1)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			else
			{
			a = tangible.StringFunctions.changeCharacter(a, i, A.charAt(i - max + len1 - 1));
			}
		}
		for (i = 0;i <= max;i++)
		{
			if (i < max - len2 + 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, B.charAt(i - max + len2 - 1));
			}
		}
			for (i = max;i >= 0;i--)
			{
				c = a.charAt(i) + b.charAt(i) - 2 * '0' + m;
			if (c > 9)
			{
				c = c - 10;
				m = 1;
			}
			else
			{
				m = 0;
			}
			p = tangible.StringFunctions.changeCharacter(p, i, c + '0');
			}
		 if ((len1 == 1) && (A.charAt(0) == '0') && (B.charAt(0) == '0'))
		 {
			 System.out.print("0\n");
		 }
		 else
		 {
			 for (i = 0;;i++)
			 {
				 if (p.charAt(i) != '0')
				 {
				 for (j = i;j <= max;j++)
				 {
				 System.out.printf("%c",p.charAt(j));
				 }
				 System.out.print("\n");
				 break;
				 }
			 }
		 }
				 return 0;
	}

}

