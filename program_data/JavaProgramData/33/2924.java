package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k = 0;
		char q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 200;j++)
			{
					String tempVar2 = ConsoleInput.scanfRead(null, 1);
					if (tempVar2 != null)
					{
						q = tempVar2.charAt(0);
					}
			 switch (q)
			 {
				case'A':
				System.out.print("T");
					break;
				case'T':
				System.out.print("A");
					break;
				case'C':
				System.out.print("G");
					break;
				case'G':
				System.out.print("C");
					break;
					 default :
						 System.out.print("\n");
			 }
			}
		}
		return 0;
	}
}

