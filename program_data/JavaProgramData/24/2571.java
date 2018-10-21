package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		String a = new String(new char[100]);
		String max = new String(new char[100]);
		String min = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int minl = a.length();
		int maxl = a.length();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			max = tangible.StringFunctions.changeCharacter(max, i, a.charAt(i));
			min = tangible.StringFunctions.changeCharacter(min, i, a.charAt(i));
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = tempVar3.charAt(0);
			}
			l = a.length();
			if (l > maxl)
			{
				for (j = 0;j < l;j++)
				{
					max = tangible.StringFunctions.changeCharacter(max, j, a.charAt(j));
				}
				maxl = l;
			}
			if (l < minl)
			{
				for (j = 0;j < l;j++)
				{
					min = tangible.StringFunctions.changeCharacter(min, j, a.charAt(j));
				}
				minl = l;
			}
		}
		max = tangible.StringFunctions.changeCharacter(max, maxl, '\0');
		for (i = 0;i < maxl;i++)
		{
			System.out.printf("%c",max.charAt(i));
		}
		System.out.print("\n");
		min = tangible.StringFunctions.changeCharacter(min, minl, '\0');
		for (i = 0;i < minl;i++)
		{
			System.out.printf("%c",min.charAt(i));
		}
	}
}

