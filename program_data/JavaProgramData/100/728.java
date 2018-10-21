package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		int t = 0;
		int l;
		int[] a = new int[300];
		l = word.length();
		int i;
		for (i = 0;i < l;i++)
		{
			if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
			{
				a[word.charAt(i)] = a[word.charAt(i)] + 1;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
			{
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 'a';i <= 'z';i++)
			{
					if (a[i] > 0)
					{
						System.out.printf("%c=%d\n", i, a[i]);
					}
			}
		}


		return 0;
	}




}

