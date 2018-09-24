package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int j;
		int k;
		int i;
		int[] num = new int[200];
		String a = new String(new char[1000]);
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int f = 0;
			int len = a.length();
			for (j = 0;j < len;j++)
			{
				num[a.charAt(j)]++;
			}
			for (j = 0;j < len;j++)
			{
				if (num[a.charAt(j)] == 1)
				{
					f++;
					System.out.printf("%c", a.charAt(j));
					break;
				}
			}
			if (f == 0)
			{
				System.out.print("no");
			}
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num,0,(Integer.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

