package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] num = new int[26];
		int index1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct f
	//	{
	//		int index;
	//		char writer[27];
	//	};
		f p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (f)malloc(m * sizeof(f)); //???????
		String p1;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i).index = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p + i).writer = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			p1 = (p + i).writer;
			for (; p1 != null;p1++)
			{
				index1 = (int) p1 - 'A'; //??????????????????
			(num[index1])++;
			}
		}
		int max = 0;
		int k;
		for (i = 0;i < 26;i++)
		{
			if (max < num[i])
			{
			max = num[i];
			k = i;
			} //?????????
		}
			char wr;
			wr = (char)k + 'A';
			System.out.printf("%c\n%d\n",wr,max);
		int flag;
		for (i = 0;i < m;i++)
		{
			p1 = (p + i).writer;
			flag = 1;
			for (; p1 && flag == 1;p1++)
			{
				if (p1 == wr)
				{
					flag = 0;
				}
			}
			if (flag == 0)
			{
				System.out.printf("%d\n",(p + i).index); //??????????????????????
			}
		}
	}
}

