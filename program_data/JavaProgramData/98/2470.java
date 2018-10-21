package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] l = new int[1000];
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, tempVar2);
		}
		l[0] = String.valueOf(s.charAt(0)).length();
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar3);
			}
			l[i] = String.valueOf(s.charAt(i)).length();
		}
		int a1 = 0;
		int a2 = 0;
		for (i = 0;i < n - 1;i++)
		{
			a1 = a1 + l[i] + 1;
			a2 = a1 + l[i + 1];
			if (a1 <= 81 && a2 <= 80)
			{
				System.out.printf("%s ",s.charAt(i));
			}
			else if (a1 <= 81 && a2>80)
			{
				if (i != n - 2)
				{
					System.out.printf("%s",s.charAt(i));
				}
				else
				{
					System.out.printf("%s\n",s.charAt(i));
				}
			}
			else
			{
				System.out.printf("\n%s ",s.charAt(i));
				a1 = l[i] + 1;
			}
		}
		System.out.printf("%s",s.charAt(n - 1));
		return 0;
	}
}

