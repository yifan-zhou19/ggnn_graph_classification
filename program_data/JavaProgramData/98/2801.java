package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s1 = new String(new char[41]);
		String s2 = new String(new char[41]);
		String now;
		String next;
		String mid;
		int i;
		int j;
		int nowlen;
		int thislen;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
	//			printf("%s\n",s1);
		now = s1;
		next = s2;
		nowlen = s1.length();
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < 41;j++)
			{
				next = tangible.StringFunctions.changeCharacter(next, j, '\0');
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				next = tempVar3.charAt(0);
			}
	//					printf("%s\n",next);
			thislen = next.length();
	//							printf("%d %d\n",nowlen,thislen);
			if (nowlen + thislen + 1 <= 80)
			{
				System.out.printf("%s ",now);
				nowlen = nowlen + thislen + 1;
			}
			else
			{
				System.out.printf("%s\n",now);
				nowlen = thislen;
			}
			mid = now;
			now = next;
			next = mid;
		}
		System.out.printf("%s",now);
		return 0;
	}




}

