package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		char[] count = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i = 0;
		int len;
		int k;
		int m;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				k = str.charAt(i) - 97;
				count[k]++;
			}
			if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
			{
				m = str.charAt(i) - 65;
				c[m]++;
			}
		}
		for (m = 0;m < 26;m++)
		{
		   if (c[m] != 0)
		   {
			 i = m + 65;
			 System.out.printf("%c=%d\n",i,c[m]);
		   }
			else
			{
			  n++;
			}
		}
		for (k = 0;k < 26;k++)
		{
		   if (count[k] != 0)
		   {
			 i = k + 97;
			 System.out.printf("%c=%d\n",i,count[k]);
		   }
			else
			{
				n++;
			}
		}
		if (n == 52)
		{
			System.out.print("No");
		}
	return 0;
	}
}

