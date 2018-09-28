package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int l;
		int t;
		int i;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
		}
		if (l == 1)
		{
		   System.out.printf("0\n%d",a.charAt(0));
		}
		else if (l == 2 && a.charAt(0) == 1 && a.charAt(1) < 3)
		{
		   System.out.printf("0\n%d%d",a.charAt(0),a.charAt(1));
		}
		else
		{
		if (a.charAt(0) == 1 && a.charAt(1) < 3)
		{
				 t = a.charAt(0) * 10 + a.charAt(1);
				 for (i = 1;i < l - 1;i++)
				 {
					t = t * 10 + a.charAt(i + 1);
					b[i - 1] = t / 13;
					t = t % 13;
				 }
				 for (i = 0;i < l - 2;i++)
				 {
				   System.out.printf("%d",b[i]);
				 }
				 System.out.printf("\n%d",t);
		}
		else
		{
				 t = a.charAt(0);
				 for (i = 0;i < l - 1;i++)
				 {
					 t = t * 10 + a.charAt(i + 1);
					 b[i] = t / 13;
					 t = t % 13;
				 }
				 for (i = 0;i < l - 1;i++)
				 {
					System.out.printf("%d",b[i]);
				 }
				 System.out.printf("\n%d",t);
		}
		}
	}

}

