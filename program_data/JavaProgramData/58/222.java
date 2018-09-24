package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String c = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (i = 0;i < n;i++)
		{
			 c = new Scanner(System.in).nextLine();
			 l = c.length();
			 p = c;
			 int a = 1;
			 if (*p == 95 || (*p > 64 && *p < 91) || (*p>96 && *p < 123))
			 {
				for (p = c.Substring(1);p < c.Substring(l);p++)
				{
					if (*p == 95 || (*p > 64 && *p < 91) || (*p>96 && *p < 123) || (*p>47 && *p < 58))
					{
						a++;
					}
					else
					{
						System.out.printf("%d\n",0);
						break;
					}
				}
				if (a == l)
				{
					System.out.printf("%d\n",1);
				}
			 }
			 else
			 {
				 System.out.printf("%d\n",0);
			 }
		}
		return 0;
	}
}

