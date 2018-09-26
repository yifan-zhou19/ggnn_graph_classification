package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int e;
		int[] age = new int[100];
		int[] six = new int[100];
	j = 0;
	char[][] id = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			if (age[i] >= 60)
			{
			   six[j] = i;
			   j++;
			}
		}
		for (i = j;i >= 0;i--)
		{
			for (k = 0;k < i - 1;k++)
			{
				if (age[six[k]] < age[six[k + 1]])
				{
				   e = six[k + 1];
				   six[k + 1] = six[k];
				   six[k] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",id[six[i]]);
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
			   System.out.printf("%s\n",id[i]);
			}
		}
		return 0;
	}


}

