package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int[] c1 = new int[52];
		int[] c2 = new int[52];
		int i;
		int l1;
		int l2;
		l1 = a.length();
		l2 = b.length();
		for (p1 = a;p1 < a.Substring(l1);p1++)
		{
			if (*p1 > 64 && *p1 < 91)
			{
				i = p1;
				c1[i - 65]++;
			}
			if (*p1 > 96 && *p1 < 123)
			{
				i = p1;
				c1[i - 71]++;
			}
		}
		for (p2 = b;p2 < b.Substring(l2);p2++)
		{
			if (p2 > 64 && p2 < 91)
			{
				i = p2;
				c2[i - 65]++;
			}
			if (p2 > 96 && p2 < 123)
			{
				i = p2;
				c2[i - 71]++;
			}
		}
		for (i = 0;i < 52;i++)
		{
		   if (c1[i] == c2[i])
		   {
			  if (i == 51)
			  {
				  System.out.print("YES");
			  }
		   }
		   else
		   {
			   System.out.print("NO");
			   break;
		   }
		}

		return 0;
	}
}

