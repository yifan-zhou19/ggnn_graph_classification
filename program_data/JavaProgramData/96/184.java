package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[100]);
		int[] a1 = new int[100];
		int[] a2 = new int[99];
		int[] a3 = new int[99];
		int i;
		int l;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		 if (l > 2)
		 {
				 for (i = 0;i < l;i++)
				 {
		a1[i] = a.charAt(i) - '0';
				 }
		a3[0] = a1[0];
		for (i = 0;i < l - 1;i++)
		{
						  a2[i] = (a1[i + 1] + a3[i] * 10) / 13;
						  a3[i + 1] = (a1[i + 1] + a3[i] * 10) % 13;

		}
		if (a2[0] != 0)
		{
						for (i = 0;i < l - 1;i++)
						{
						b = tangible.StringFunctions.changeCharacter(b, i, a2[i] + '0');
						}
						b = b.substring(0, l - 1);
		}
		else
		{
								for (i = 1;i < l - 1;i++)
								{
								b = tangible.StringFunctions.changeCharacter(b, i - 1, a2[i] + '0');
								}
								b = b.substring(0, l - 2);
		}
		System.out.printf("%s\n",b);
		System.out.printf("%d\n",a3[l - 1]);
		 }
	if (l == 2)
	{
		x = (a.charAt(0) - '0') * 10 + (a.charAt(1) - '0');
		System.out.printf("%d\n",x / 13);
		System.out.printf("%d\n",x % 13);
	}
	   if (l == 1)
	   {
	   x = a.charAt(0) - '0';
	   System.out.printf("%d\n",x / 13);
	   System.out.printf("%d\n",x % 13);
	   }
	}

}

