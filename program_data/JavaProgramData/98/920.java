package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> p1, tangible.RefObject<String> p2, int l)
	{
		String x1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t2;
		int y = 1;
		t1 = p1.argValue;
		x1 = t1 + l - 1;
		t2 = p2.argValue;
		while ((t1 <= x1) && y != 0)
		{
			if (*t1 != *t2)
			{
				y = 0;
			}
			t1++;
			t2++;
		}
		return y;
	}

	public static void Main()
	{
		String c = new String(new char[3243]);
			int i;
			int j;
			int k;
			int n;
			int l;
			int len;
		//freopen("tt.in","r",stdin);
		//freopen("tt.out","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		//for(i=0;i<=l-1;i++) if (c[i]==' ') k++;


		len = 0;
		for (i = 1;i <= n;i++)
		{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		l = c.length();
		if (len == 0)
		{
			System.out.printf("%s",c);
			len += l;
		}
		else
		{
		   if (len + l + 1 <= 80)
		   {
			System.out.printf(" %s",c);
			len += l + 1;
		   }
		   else
		   {
			   System.out.printf("\n%s",c);
			   len = l;
		   }
		}

		}



	}
}

