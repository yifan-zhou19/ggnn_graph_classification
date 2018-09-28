package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i <= b.length() - a.length();i++)
		{
			n = 0;
			for (j = i,k = 0;k < a.length();j++,k++)
			{
				if ((int)(a.charAt(k) - b.charAt(j)) == 0)
				{
					n++;
				}
			}
			if (n != a.length())
			{
				continue;
			}

				System.out.printf("%d",i);
				break;

		}

		return 0;

	}
}

