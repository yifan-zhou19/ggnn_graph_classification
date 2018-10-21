package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int wan;
		int ge;
		int shi;
		int bai;
		int qian;
		int zheng;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zheng = Integer.parseInt(tempVar);
		}
		wan = zheng / 10000;
		qian = zheng / 1000 - wan * 10;
		bai = zheng / 100 - wan * 100 - qian * 10;
		shi = zheng / 10 - wan * 1000 - qian * 100 - bai * 10;
		ge = zheng - wan * 10000 - qian * 1000 - bai * 100 - shi * 10;
		if (wan != 0)
		{
			System.out.printf("%d",wan + qian * 10 + bai * 100 + shi * 1000 + ge * 10000);
		}
			else
			{
			if (qian != 0)
			{
					System.out.printf("%d",qian + bai * 10 + shi * 100 + ge * 1000);
			}
			else
			{
				if (bai != 0)
				{
					System.out.printf("%d",bai + shi * 10 + ge * 100);
				}
				else
				{
					if (shi != 0)
					{
						System.out.printf("%d",shi + ge * 10);
					}
					else
					{
						System.out.printf("%d",ge);
					}
				}
			}
			}



	}

}

