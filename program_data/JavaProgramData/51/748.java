package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[500];
		int m = 0;
		int al;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;i < 500 - n;i++)
		{
			count[i] = 0;
		}
		al = a.length();
		for (i = 0;i <= al - n;i++)
		{
			//?????b 
			for (j = 0;j < n;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i + j));
			}
			b = tangible.StringFunctions.changeCharacter(b, n + i, '\0');
			//??c??? 
			for (k = i;k <= al - n;k++)
			{
				for (j = 0;j < n;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j + k));
				}
				c = tangible.StringFunctions.changeCharacter(c, n + k, '\0');
				if (strcmp(b,c) == 0)
				{
				count[i]++;
				}
			}
		}
		//?????
		for (i = 0;i < al - n;i++)
		{
			if (count[m] < count[i])
			{
			m = i;
			}
		}
		//?? 
		if (count[m] == 1)
		{
		System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",count[m]);
		for (i = 0;i <= al - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i + j));
			}
			b = tangible.StringFunctions.changeCharacter(b, n, '\0');
			if (count[i] == count[m])
			{
			System.out.printf("%s\n",b);
			}
		}
		}
	}
}

