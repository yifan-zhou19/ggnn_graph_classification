package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int k;
		int lens;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		lens = s.length();

		for (i = 0;w.charAt(i + lens - 1) != '\0';i++)
		{
			j = 0;
			k = i;

			while ((w.charAt(k) == s.charAt(j)) && (j < lens))
			{
				k++;
				j++;
			}

			if (j == lens)
			{
				System.out.printf("%d",i);
			 break;
			}
		}
		return 0;
	}
}

