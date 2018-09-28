package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int count;
		int mid;
		int judge;
		int[] re = new int[110];
		String num = new String(new char[110]);
		String fra = new String(new char[110]);
		count = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		l = num.length();
		for (i = 0;i < l;i++)
		{
			fra = tangible.StringFunctions.changeCharacter(fra, i, num.charAt(i));
		}
		judge = (num.charAt(0) - '0') * 10 + (num.charAt(1) - '0');
	//	for(i=0;i<l;i++){
	//		printf("%c\n",fra[i]);
	//	}
		for (i = 0;i < l - 1;i++)
		{
			mid = (fra.charAt(i) - '0') * 10 + (fra.charAt(i + 1) - '0');
			count++;
			re[count] = mid / 13;
			if (count == 0 && re[count] == 0)
			{
				re[0] = 10000;
			}
			fra = tangible.StringFunctions.changeCharacter(fra, i + 1, mid % 13 + '0');
		}
		for (i = 0;i < l - 1;i++)
		{
			if (re[i] == 10000 && i == 0)
			{
				continue;
			}
			System.out.printf("%d",re[i]);
		}
		if (l < 2)
		{
			judge = 0;
		}
		if (l > 2 || (l == 2 && judge > 12))
		{
			System.out.printf("\n%d",fra.charAt(l - 1) - '0');
		}
		else if (l == 1 || (l == 2 && judge < 13))
		{
			System.out.print("0\n");
			if (l == 1)
			{
				System.out.printf("%c",num.charAt(0));
			}
			else if (l == 2)
			{
				System.out.printf("%d",judge);
			}
		}
		return 0;
	}
}

