package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int len;
		String zfc = new String(new char[100000]);
		for (i = 0;i < t;i++)
		{
			int NUM = 0;
			int num;
			//printf("hehe");
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			len = zfc.length();
			for (j = 0;j < len;j++)
			{
				num = 0;
				for (k = 0;k < len;k++)
				{
					if (j == k)
					{
						continue;
					}
					else
					{
						if (zfc.charAt(j) != zfc.charAt(k))
						{
							num++;
						}
					}
					//printf("%d",num);
				}
				//printf("aha");
				if (num == len - 1)
				{
					System.out.printf("%c\n",zfc.charAt(j));
					//printf("hong");
					break;
				}
				else
				{
					NUM++; //printf("he");
				}
			}
			if (NUM == len)
			{
				System.out.print("no");
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

