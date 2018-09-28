package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l2;
		int mark;
		int count = 0;
		int k = 0;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l2;i++)
		{
			count = 0;
			//k=0;
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < l1;j++)
				{
					if (b.charAt(i + j) == a.charAt(k++))
					{
						count++;
					}
				}
			}
			if (count == l1)
			{
				mark = i;
			}
		}
		System.out.printf("%d\n",mark);


		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

