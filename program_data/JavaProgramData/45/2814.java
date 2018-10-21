package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l1;
		int l2;
		int j;
		int k;
		int I;
		int J = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char c;

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

	l1 = a.length();
	l2 = b.length();

	for (j = 0;j < 50;j++)
	{
		if (a.charAt(0) == b.charAt(j))
		{

			for (k = 0;k <= l1;k++)
			{
				if (a.charAt(k) != b.charAt(j + k))
				{
			break;
				}
			if (k == l1 - 1)
			{
				J = j;
			break;
			}

			}
			if (J != 0)
			{
				System.out.printf("%d",J);
				break;
			}


		}
	}
	return 0;
	}

}

