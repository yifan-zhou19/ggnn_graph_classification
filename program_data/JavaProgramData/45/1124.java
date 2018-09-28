package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz1 = new String(new char[100]);
		String sz2 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz2 = tempVar2.charAt(0);
		}
		for (i = 0;sz2.charAt(i) != 0;i++)
		{
			p = sz2.charAt(i);
			for (k = 0;sz1.charAt(k) != 0;k++)
			{
				   if (*p != sz1.charAt(k))
				   {
					   break;
				   }
				   else
				   {
					   p++;
				   }
			}
				   if (sz1.charAt(k) == 0)
				   {
					   break;
				   }
		}
		System.out.printf("%d",i);
	return 0;
	}
}

