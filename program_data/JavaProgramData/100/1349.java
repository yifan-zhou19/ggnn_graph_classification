package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[300]);
		char c;
		int i = 0;
		int j;
		int k;
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (p = str; * p != '\0';p++)
		{
			if (*p >= 'a' && *p <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, *p);
				i++;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
			return 0;
		}

		for (j = 0;j < i;j++)
		{
			for (k = j + 1;k < i;k++)
			{
				if (a.charAt(j) > a.charAt(k))
				{
					c = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(k));
					a = tangible.StringFunctions.changeCharacter(a, k, c);
				}
			}
		}


		for (j = 0;j < i;j++)
		{
			b[j] = 1;
			for (k = j + 1;k < i;k++)
			{
				if (a.charAt(j) == a.charAt(k))
				{
					b[j]++;
					a = tangible.StringFunctions.changeCharacter(a, k, '0');
				}
			}
		}

		for (j = 0;j < i;j++)
		{
			if (a.charAt(j) != '0')
			{
				System.out.printf("%c=%d\n",a.charAt(j),b[j]);
			}
		}

		return 0;
	}






}

