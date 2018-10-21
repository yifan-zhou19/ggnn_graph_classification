package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[1000]);
		int i;
		int changdu;
		int n;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (t < n)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,0,(Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			changdu = x.length();
			for (i = 0;i < changdu;i++)
			{
				if (x.charAt(i) == 'A')
				{
					System.out.print("T");
				}
				else if (x.charAt(i) == 'T')
				{
					System.out.print("A");
				}
				else if (x.charAt(i) == 'C')
				{
					System.out.print("G");
				}
				else if (x.charAt(i) == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
			changdu = i = 0;
			t++;
		}
		return 0;
	}
}

