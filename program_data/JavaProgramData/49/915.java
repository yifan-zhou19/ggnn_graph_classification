package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int sig = 0;
		int k;
		int kk;
	String s = new String(new char[502]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	n = s.length();
	for (i = 2;i <= n;i++)
	{
			for (k = 0;k <= n - i;k++)
			{
				for (j = 0;j <= i - 1;j++)
				{
					   if (*(p + j) != *(p + i - j - 1))
					   {
							   sig = 1;
							   break;
					   }
				}
			if (sig == 0)
			{
					 for (kk = 0;kk <= i - 1;kk++)
					 {
					 System.out.printf("%c",*(p + kk));
					 }
		  System.out.print("\n");
			}
				sig = 0;
			p = p + 1;
			}
			p = s;
	}
	return 0;
	}
}

