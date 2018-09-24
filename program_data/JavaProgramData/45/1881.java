package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int len1;
		int i = 0;
		int p = 0;
		int j;
		int k = 0;
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
		len1 = a.length();
	do
	{
			if (a.charAt(i) == b.charAt(p))
			{
				i++;
				p++;

			}
			else
			{
				if (a.charAt(i) != b.charAt(p))
				{
				k++;
				p = k;
				i = 0;

				}
			}
	} while (i < len1);
		j = k;
		System.out.printf("%d",j);
		return 0;
	}
}

