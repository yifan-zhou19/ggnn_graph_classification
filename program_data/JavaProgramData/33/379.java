package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			if (i != 0)
			{
				System.out.print("\n");
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				if (a.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				if (a.charAt(j) == 'G')
				{
					System.out.print("C");
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

