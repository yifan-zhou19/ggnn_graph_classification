package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m1;
		int m2;
		int m3;
		int n1;
		int n2;
		int n3;
		int i;
		int j;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m1 = Integer.parseInt(tempVar);
			}
			if (m1 != 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m2 = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					m3 = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					n1 = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					n2 = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					n3 = Integer.parseInt(tempVar6);
				}
				i = (n1 - m1 + 12) * 3600 + (n2 - m2) * 60 + n3 - m3;
				System.out.printf("%d\n",i);
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

