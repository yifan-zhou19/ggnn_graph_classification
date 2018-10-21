public class book
{
	public int num;
	public String edt = new String(new char[27]);
}
public class total //??????????????
{
	public char name;
	public int amount;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		total[] to = tangible.Arrays.initializeWithDefaulttotalInstances(27);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].edt = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			to[i].name = 'A' + i; //????26???
			to[i].amount = 0;
		}
		//???????????
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(bk[i].edt).length();j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (bk[i].edt.charAt(j) == to[k].name)
					{
						to[k].amount++;
					}
				}
			}
		}
		//???????????????to[k]??
		for (i = k = 0;i < 26;i++)
		{
			if (to[i].amount > to[k].amount)
			{
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",to[k].name,to[k].amount);
		//??????????
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(bk[i].edt).length();j++)
			{
				if (bk[i].edt.charAt(j) == to[k].name)
				{
					System.out.printf("%d\n",bk[i].num);
				}
			}
		}
		return 0;
	}
}

