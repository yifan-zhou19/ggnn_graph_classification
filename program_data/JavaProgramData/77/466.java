package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		int[] a = new int[100];
		int c;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		i = c = 0;
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != s.charAt(0))
			{
				a[c++] = i;
			}
			i++;
		}
		for (i = 0;i < c;i++)
		{
			for (j = a[i];j >= 0;j--)
			{
				if (s.charAt(j) == s.charAt(0))
				{
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
					System.out.printf("%d %d\n",j,a[i]);
					break;
				}
			}
		}
			return 0;
	}


}

