package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] c = new int[60];
		int i;
		int j = 1;
		int len;
		int tem;
		String str = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
		   if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
		   {
				tem = str.charAt(i) - 'A';
				c[tem]++;
				j = 0;

		   }
		}
		for (i = 0;i < 60;i++)
		{
			if (c[i] != 0)
			{
			System.out.printf("%c=%d\n",'A' + i,c[i]);
			}
		}
			if (j != 0)
			{
			 System.out.print("No");
			}

		 return 0;

	}

}

