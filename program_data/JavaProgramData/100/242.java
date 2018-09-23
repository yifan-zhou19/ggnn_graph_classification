package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		char t;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
			for (i = 0;i < str.length() - 1;i++)
			{
			k = i;
			for (j = i + 1;j < str.length();j++)
			{
				if (str.charAt(j) < str.charAt(k))
				{
				k = j;
				}
			}
				t = str.charAt(k);
				str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(i));
				str = tangible.StringFunctions.changeCharacter(str, i, t);

			}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				a[i] = 1;
				for (j = i + 1;j < str.length();j++)
				{
					if (str.charAt(j) == str.charAt(i))
					{
						a[i]++;
						str = tangible.StringFunctions.changeCharacter(str, j, '0');
					}
				}
			}
		}


		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				f = 1;
				System.out.printf("%c=%d\n",str.charAt(i),a[i]);
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
	}
}

