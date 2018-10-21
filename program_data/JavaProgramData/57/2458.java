package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
		String s = new String(new char[255]);
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
				s = tempVar2.charAt(0);
			}
			a = s.length();
			if (s.charAt(a - 1) == 'r' && s.charAt(a - 2) == 'e')
			{
				for (j = 0;j < a - 2;j++)
				{
				System.out.printf("%c",s.charAt(j));
				}
			System.out.print("\n");
			}

			if (s.charAt(a - 1) == 'g' && s.charAt(a - 2) == 'n' && s.charAt(a - 3) == 'i')
			{
				for (k = 0;k < a - 3;k++)
				{
				System.out.printf("%c",s.charAt(k));

				}
			System.out.print("\n");
			}

			if (s.charAt(a - 1) == 'y' && s.charAt(a - 2) == 'l')
			{
				for (l = 0;l < a - 2;l++)
				{
				System.out.printf("%c",s.charAt(l));
				}
			System.out.print("\n");
			}
		}
	}

}

