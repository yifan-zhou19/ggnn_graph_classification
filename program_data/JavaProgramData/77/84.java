package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		char boy = s.charAt(0);
		int[] m = new int[1000];
		int i;
		int j = 0;
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) == boy)
			{
			m[j++] = i;
			}
			else if (s.charAt(i) != boy)
			{
				System.out.printf("%d %d\n",m[--j],i);
			}
		}
		return 0;
	}
}

