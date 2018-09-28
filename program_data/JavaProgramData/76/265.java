package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int l = 0;
		int r = 0;
		String qujian = new String(new char[N]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(qujian,0,(Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (i = a;i < b;i++)
			{
			qujian.charAt(i)++;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (qujian.charAt(i) != null)
			{
				l = i;
			break;
			}
		}
		for (i = N;i > 0;i--)
		{
			if (qujian.charAt(i - 1) != null)
			{
			 r = i;
			break;
			}
		}
		for (i = l;i < r;i++)
		{
			if (!qujian.charAt(i))
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",l,r);

	}
}

