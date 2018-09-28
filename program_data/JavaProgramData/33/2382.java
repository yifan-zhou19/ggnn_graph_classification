package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count;
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			/*for (int j=0,count=0;j<300;j++)
			{
				scanf("%c",&a[j]);
				if(a[j]=='\n')
					break;
				count+=1;
			}*/
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (int m = 0;m < a.length();m++)
			{
				if (a.charAt(m) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(m) == 'T')
				{
					System.out.print("A");
				}
				if (a.charAt(m) == 'C')
				{
					System.out.print("G");
				}
				if (a.charAt(m) == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

