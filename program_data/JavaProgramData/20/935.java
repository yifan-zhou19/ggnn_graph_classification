package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30]);
		String b = new String(new char[10]);
		char max;
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
		int la;
		int lb;
		int index;
		int i;
		do
		{
			la = a.length();
			lb = b.length();
			max = a.charAt(0);
			index = 0;
			for (i = 0;i < la;i++)
			{
				if (a.charAt(i) > max)
				{
					max = a.charAt(i);
				}
			}
			for (i = 0;i < la;i++)
			{
				if (a.charAt(i) == max)
				{
					index = i;
					break;
				}
			}
			for (i = 0;i <= index;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = index + 1;i <= index + lb;i++)
			{
				System.out.printf("%c",b.charAt(i - index - 1));
			}
			for (i = index + lb + 1;i < la + lb;i++)
			{
				System.out.printf("%c",a.charAt(i - lb));
			}
			System.out.print("\n");
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = tempVar3.charAt(0);
			}
		} while (scanf("%s",b) != EOF);
	}

}

