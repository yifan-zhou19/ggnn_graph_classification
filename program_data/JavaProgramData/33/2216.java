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
		char a;
		char b;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tempVar3.charAt(0);
				}
				 if (a == 'A')
				 {
					 b = 'T';
					System.out.printf("%c",b);
				 }
				 if (a == 'T')
				 {
					 b = 'A';
					System.out.printf("%c",b);
				 }
				 if (a == 'G')
				 {
					 b = 'C';
					System.out.printf("%c",b);
				 }
				 if (a == 'C')
				 {
					 b = 'G';
					System.out.printf("%c",b);
				 }
				 if (a == '\n')
				 {
					 System.out.print("\n");
					 break;
				 }
			}
		}
		return 0;
	}
}

