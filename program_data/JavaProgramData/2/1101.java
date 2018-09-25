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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int booknumber;
	//		char writer[27];
	//	}
	//	book[999];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].booknumber = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].writer = tempVar3;
			}
		}
		int[] writerbookquantity = new int[26];
		for (i = 0;i < 26;i++)
		{
			writerbookquantity[i] = 0;
		}
		int j;
		int len;
		int x;
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(book[i].writer).length();
			for (j = 0;j < len;j++)
			{
				x = book[i].writer[j] - 'A';
				writerbookquantity[x]++;
			}
		}
		int maxwriter = 0;
		int maxquantity = 0;
		for (i = 0;i < 26;i++)
		{
		   if (writerbookquantity[i] > maxquantity)
		   {
			   maxquantity = writerbookquantity[i];
			   maxwriter = i;
		   }
		}
		System.out.printf("%c\n%d\n",(char)(maxwriter + 'A'),writerbookquantity[maxwriter]);
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(book[i].writer).length();
			for (j = 0;j < len;j++)
			{
				if ((int)book[i].writer[j] == maxwriter + 'A')
				{
					System.out.printf("%d\n",book[i].booknumber);
				}

			}
		}
		return 0;

	}

}

