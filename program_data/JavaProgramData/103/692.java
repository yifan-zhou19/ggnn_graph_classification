package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		int i;
		int flag;
		int j;
		int[] c = new int[100];
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 1000;i++)
		{
			if (a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		if (a.charAt(i) == 0)
		{
			break;
		}
		}
		flag = i;
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		j = 0;
		for (i = 0;i <= flag;i++)
		{
			c[i] = 1;
		}
		for (i = 1;i <= flag;i++)
		{
			if (b.charAt(j) == a.charAt(i))
			{
		c[j]++;
			}
		else
		{
			j++;
		b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		}
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("(%c,%d)",b.charAt(i),c[i]);
		}
		return 0;
	}
}

