package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String word = new String(new char[40]);
		String max = new String(new char[40]);
		String min = new String(new char[40]);
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = tempVar2.charAt(0);
		}
		min = max;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				word = tempVar3.charAt(0);
			}
			if (word.length() > max.length())
			{
				max = word;
			}
			if (word.length() < min.length())
			{
				min = word;
			}
		}
		System.out.printf("%s\n",max);
		System.out.printf("%s",min);

	}
}

