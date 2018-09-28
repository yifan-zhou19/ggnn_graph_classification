package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int k = 0;
		int flag = 0;
		for (j = 0;1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, tempVar2);
			}
			if (a.charAt(j) == '\n' && j != 0)
			{
				j = j - 1;
			break;
			}
		}
	//	printf("%d",j);
		for (i = 1;1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar3);
			}
			if (b.charAt(i) == '\n')
			{
				i = i - 1;
			break;
			}

		}
		//printf("%d",i);
		if (i != j)
		{
			flag = 1;
		}
		else
		{
			for (i = 1;i <= j;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					flag = 1;
					break;
				}
				else if (a.charAt(i) == b.charAt(i))
				{
					k = k + 1;

				}
			}
		}
		//printf("%d\n",k);
		if (flag == 1)
		{
			System.out.print("error");
		}
		else
		{
			if (1.0 * k / j > n)
			{
			System.out.print("yes");
			}
		else
		{
			System.out.print("no");
		}
		}











		return 0;


	}
}

