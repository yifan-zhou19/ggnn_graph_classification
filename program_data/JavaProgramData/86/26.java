package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct tiao
	//	{
	//		int *ln;
	//		int k;
	//		int sumt;
	//	}
	//	*tiao1;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		tiao1 = (tiao) malloc(sizeof(tiao) * n);
		int i;
		int j;
		int f = 0;
		for (i = 0 ; i < n ; i++)
		{
			f = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tiao1[i].k = tempVar2;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			tiao1[i].ln = (int) malloc((Integer.SIZE / Byte.SIZE) * tiao1[i].k);
			tiao1[i].sumt = 0;
			for (j = 0 ; j < tiao1[i].k ; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					tiao1[i].ln[j] = tempVar3;
				}
			}
			if (tiao1[i].k == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (j = 0 ; j < tiao1[i].k ; j++)
			{
				tiao1[i].sumt = (tiao1[i].ln[j] + 3 * (j));
				if (tiao1[i].sumt >= 60)
				{
					int tmp1;
					tmp1 = tiao1[i].ln[j - 1] + 3 * (j);
					if (tmp1 >= 60)
					{
						System.out.printf("%d\n",tiao1[i].ln[j - 1]);
					}
					if (tmp1 < 60 && 60 - tmp1 > 3)
					{
						tmp1 = 60 - tmp1 + tiao1[i].ln[j - 1];
						System.out.printf("%d\n",tmp1);
					}
					break;
				}
			}
			if (tiao1[i].sumt < 57)
			{
				tiao1[i].sumt += 3;
				j--;
				System.out.printf("%d\n",(60 - tiao1[i].sumt + tiao1[i].ln[j]));
			}
			if (tiao1[i].sumt < 60 && tiao1[i].sumt > 57)
			{
				System.out.printf("%d\n",tiao1[i].ln[j - 1]);
			}
		}
		return 0;
	}
}

