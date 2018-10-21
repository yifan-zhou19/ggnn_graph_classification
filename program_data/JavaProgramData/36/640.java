package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int lena;
		int lenb;
		int i;
		int j;
		int flag;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		lena = a.length();
		lenb = b.length();

		if (lena == lenb)
		{
			for (i = 0;i < lena;i++)
			{
				flag = 0;
				for (j = 0;j < lenb;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '0');
						b = tangible.StringFunctions.changeCharacter(b, j, '0');
						flag = 1;
						break;
					}
				}
				//if(flag==0)printf("NO\n");
			}
			if (strcmp(a,b) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

