public class book
{
	public int num;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int judge(tangible.RefObject<String> a, int b)
	{
		int i = 0;
		for (i = 0;i < 26;i++)
		{
			if (a.argValue.charAt(i) == 'A' + b)
			{
				return 1;
			}
		}
		return 0;
	}
	public static void Main(String[] args)
	{
		char c;
		int n = 0;
		int i = 0;
		int j = 0;
		int[] rec = new int[26];
		int k = 0;
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
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].name = tempVar3.charAt(0);
			}
		} //????
		for (i = 0;i < 26;i++) //??i??????
		{
			for (j = 0;j < n;j++) //??j?????
			{
				if (judge(book[j].name, i) == 1) //???j????????i
				{
					rec[i]++;
				} //??i?????????rec[i]?????????
			} //??????????i??????????
		} //?????????26??????????????
		j = 0; //j??????????????????
		k = rec[0]; //k??????????????
		for (i = 0;i < 25;i++)
		{
			if (k < rec[i])
			{
				j = i;
				k = rec[i];
			}
		}
		c = 'A' + j;
		System.out.printf("%c\n%d\n",c,k);
		for (i = 0;i < n;i++)
		{
			if (judge(book[i].name, j) == 1)
			{
				System.out.printf("%d\n",book[i].num);
			}
		}
	}

}

