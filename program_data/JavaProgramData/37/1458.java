package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[26];
		int[] aptr = new int[26]; //aprt[0]???????????[1]???????????????
		int ap = 0;
		int j;
		char tmpch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			tmpch = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			ap = 0;
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				tmpch = tempVar3.charAt(0);
			}
			while (tmpch != '\n')
			{
				if (a[tmpch - 'a'] == 0) //???????????aptr?
				{
					aptr[ap++] = tmpch - 'a';
				}
				a[tmpch - 'a']++; //tmpch??????
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					tmpch = tempVar4.charAt(0);
				}
			}
			for (j = 0;j < ap;j++)
			{
				if (a[aptr[j]] == 1)
				{
					break;
				}
			}
			if (j < ap)
			{
				System.out.printf("%c\n",aptr[j] + 'a');
			}
			else
			{
				System.out.print("no\n");
			}
			for (j = 0;j < 26;j++)
			{
				a[j] = 0;
			}
		}
		return 0;
	}
}

