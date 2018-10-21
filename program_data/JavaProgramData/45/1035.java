package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[50];
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int i;
		int count = 0;
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			if (s2.charAt(i) == s1.charAt(0))
			{
			count++;
			if (count == 1)
			{
				System.out.printf("%d",i);
			}
			}
		}
		return 0;
	}


}

