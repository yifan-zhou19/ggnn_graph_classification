package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String q = new String(new char[101]);
		int i = 0;
		int rem = 0;
		int d = 0;
		int[] b = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		if (a.charAt(1) == '\0')
		{
			System.out.printf("0\n%c",a.charAt(0));
		}
		else if (((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13) && a.charAt(2) == '\0')
		{
		System.out.printf("0\n%s",a);
		}
		else
		{
		b[0] = 10 * (a.charAt(0) - '0') + a.charAt(1) - '0';
		for (i = 0;i <= a.length() - 2;i++)
		{
			q = tangible.StringFunctions.changeCharacter(q, i, (b[i] / 13) + '0');
			rem = b[i] % 13;
	   /*     printf("%c,%d\n",q[i],b[i]);        */
			b[i + 1] = a.charAt(i + 2) + rem * 10 - '0';
		}
		 q = tangible.StringFunctions.changeCharacter(q, a.length() - 1, '\0');
		 if (q.charAt(0) == '0')
		 {
				for (i = 0;q.charAt(i) != '\0';i++)
				{
					  q = tangible.StringFunctions.changeCharacter(q, i, q.charAt(i + 1));
				}
		 }
		System.out.printf("%s\n",q);
		System.out.printf("%d",rem);
		}
	}

}

