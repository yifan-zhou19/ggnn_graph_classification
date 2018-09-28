package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String wd = new String(new char[3000]);
		int i;
		int s = 0;
		int[] re = new int[300];
		for (i = 0;i < 300;i++)
		{
		   re[i] = 0;
		}
		wd = new Scanner(System.in).nextLine();
		for (i = 0;wd.charAt(i) != '\0';i++)
		{
		   if (wd.charAt(i) != ' ')
		   {
			 re[s]++;
		   }
		   if (wd.charAt(i) == ' ' && wd.charAt(i + 1) != ' ')
		   {
			 s++;
		   }
		}
		for (i = 0;i < s;i++)
		{
		   System.out.printf("%d,",re[i]);
		}
		System.out.printf("%d",re[s]);
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

