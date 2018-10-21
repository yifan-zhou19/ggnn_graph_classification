package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int x;
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		x = a.length();
		p = 0;
		while (p < x / 2)
		{
			i = 0;
			while (a.charAt(i) != a.charAt(x - 1))
			{
				i++;
				j = i;
			}
			j--;
			while (a.charAt(j) != a.charAt(0))
			{
				j--;
			}
			System.out.printf("%d %d\n",j,i);
			a = tangible.StringFunctions.changeCharacter(a, i, a[j] = 0);
			p++;
		}
	}





}

