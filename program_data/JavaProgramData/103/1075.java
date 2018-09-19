package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[10]);
		int[] num = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i = 0;
		while (a.charAt(i) != '\0')
		{
			  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			  {
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			  }
			  i++;
		}
		int j = 0;
		b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(0));
		for (int i = 1;i <= 999;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
			num[j]++;
			}
			else
			{
				j++;
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			}
			if (a.charAt(i) == '\0')
			{
			break;
			}
		}
		for (int i = 0;i <= j - 1;i++)
		{
		System.out.printf("(%c,%d)",b.charAt(i),num[i]);
		}
		System.out.print("\n");

	}
}

