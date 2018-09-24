package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int k;
		int t = 1;
		for (k = 0;k <= (int)b.length();k++)
		{
			for (i = 0;i < (int)a.length();i++)
			{
			   if (a.charAt(i) == b.charAt(k + i))
			   {
					t = 1;
			   }
				else
				{
					t = 0;
					break;
				}
			}
				if (t == 1)
				{
				break;
				}
		}
		if (t == 0)
		{
			System.out.print("0");
		}
		else
		{
			System.out.printf("%d",k);
		}
		System.out.print("\n");
	}
}

