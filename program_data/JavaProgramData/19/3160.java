package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]); //????????
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[][] d = new char[101][101];
		int l; //???s?
		int i; //????
		int j;
		int k;
		while (gets(s))
		{ //?????s
			int t = 0;
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
			System.in.read();
			l = s.length(); //?????s???
			i = 0; //???????
			j = 0;
			k = 0;
			for (i = 0;i <= l;i++)
			{ //??
				if (s.charAt(i) == ' ')
				{ //????????????
					d[j][k] = '\0';
					k = 0;
					++j; //?????1
				}
				else if (s.charAt(i) == '\0')
				{ //???????
					d[j][k] = '\0';
					++j; //?????1
				}
				else
				{
					d[j][k] = s.charAt(i);
					++k; //??????????????
				}
			}
			for (i = 0;i < j;i++)
			{ //??
				if (strcmp(a,d[i]) == 0) //?????????
				{
					d[i] = b;
				}
			}
			for (i = 0;i < j - 1;i++) //??
			{
				System.out.printf("%s ",d[i]);
			}
			System.out.printf("%s\n",d[i]);
		} //????
		return 0;
	}
}

