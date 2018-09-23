package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		t = a;
		if (a == 1 || b == 1)
		{
			System.out.print("1");
		}
		else
		{
			for (i = 0;i < 10;i++)
			{
				s = b;
				for (j = 0;j < 10;j++)
				{
					if (t == s)
					{
						break;
					}
					s = s / 2;
				}
				if (t == s)
				{
					break;
				}
				t = t / 2;
			}
			System.out.printf("%d",s);
		}
	}



}

