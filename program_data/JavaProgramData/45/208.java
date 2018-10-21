package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
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
		i = 0;
		j = 0;
		while (a.charAt(i) != 0 && b.charAt(i) != 0)
		{
			if (b.charAt(j) == a.charAt(i))
			{
				j++;
				i++;
			}
			else
			{
				j++;
				i = 0;
			}
		}
		if (a.charAt(i) == 0)
		{
			System.out.printf("%d\n",j - i);
		}
		else
		{
			System.out.print("no\n");
		}
	}



}

