package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void saima(int * tian,int * qi,int n);
		int n;
		int i;
		int k;
		int[] tianji = new int[1000];
		int[] qiwang = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tian,*qi;
		int tian;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *qi;
		int qi;
		tian = tianji;
		qi = qiwang;
		for (k = 0;;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tian + i = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qi + i = Integer.parseInt(tempVar3);
				}
			}
		tangible.RefObject<Integer> tempRef_tian = new tangible.RefObject<Integer>(tian);
		tangible.RefObject<Integer> tempRef_qi = new tangible.RefObject<Integer>(qi);
			saima(tempRef_tian, tempRef_qi, n);
			qi = tempRef_qi.argValue;
			tian = tempRef_tian.argValue;
		}
		return 0;
	}

	public static void saima(tangible.RefObject<Integer> tian, tangible.RefObject<Integer> qi, int n)
	{
		int i;
		int k;
		int e;
		int sheng = 0;
		int ping = 0;
		int shu = 0;
		int money;
		for (i = n - 1;i >= 0;i--)
		{
			for (k = 0;k < i;k++)
			{
				if (*(tian.argValue + k) > *(tian.argValue + k + 1))
				{
					e = (tian.argValue + k);
					*(tian.argValue + k) = *(tian.argValue + k + 1);
					*(tian.argValue + k + 1) = e;
				}
				if (*(qi.argValue + k) > *(qi.argValue + k + 1))
				{
					e = (qi.argValue + k);
					*(qi.argValue + k) = *(qi.argValue + k + 1);
					*(qi.argValue + k + 1) = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(tian.argValue + i) != -1)
			{
				for (k = n - 1;k >= 0;k--)
				{
					if (*(tian.argValue + i) > *(qi.argValue + k) && *(qi.argValue + k) != -1)
					{
						sheng = sheng + 1;
						*(tian.argValue + i) = -1;
						*(qi.argValue + k) = -1;
						k = -1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(tian.argValue + i) != -1)
			{
				for (k = n - 1;k >= 0;k--)
				{
					if (*(tian.argValue + i) == *(qi.argValue + k) && *(qi.argValue + k) != -1)
					{
						ping = ping + 1;
						*(tian.argValue + i) = -1;
						*(qi.argValue + k) = -1;
						k = -1;
					}
				}
			}
		}
		money = 200 * (sheng - (n - sheng - ping));
		System.out.printf("%d\n",money);
	}
}

