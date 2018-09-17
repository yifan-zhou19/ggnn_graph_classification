package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char q;
		String str = new String(new char[300]);
		String alp = new String(new char[300]);
		int val;
		int i;
		int j;
		int len;
		int[] t = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				alp = tangible.StringFunctions.changeCharacter(alp, m, str.charAt(i));
				m++;
			} //????m?????
		}
		if (m == 0)
		{
			System.out.print("No\n");
		}
		else
		{

		for (i = 0;i < m - 1;i++) //????????
		{
			for (j = 0;j < m - 1 - i;j++)
			{
			if (alp.charAt(j) >= alp.charAt(j + 1))
			{
				q = alp.charAt(j);
			alp = tangible.StringFunctions.changeCharacter(alp, j, alp.charAt(j + 1));
			alp = tangible.StringFunctions.changeCharacter(alp, j + 1, q);
			}
			}
		}
		for (i = 1;i < m;i++)
		{
			val = 1;
			for (j = 0;j < i;j++)
			{
				if (alp.charAt(i) != alp.charAt(j))
				{
					continue;
				}
			else
			{
				val = 0;
				t[j]++;
				break;
			}
			}
			if (val != 0)
			{
				t[i]++;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (t[i] != 0)
			{
				System.out.printf("%c=%d\n",alp.charAt(i),t[i]);
			}
		}
		}
	}
}

