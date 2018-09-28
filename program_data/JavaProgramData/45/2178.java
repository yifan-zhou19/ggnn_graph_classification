package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String aa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * bb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		char[][] c = new char[50][50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * cc;
		int len = a.length();
		int k = 0;
		int i;
		int j = 0;
		for (bb = b; * (bb + len - 1) != '\0';bb++,k++)
		{
			i = 0;
			for (cc = c[k];i < len;i++,cc++)
			{
				* cc =  (bb + i);
			}
			* cc = '\0';
			j++;
		}
		for (i = 0;i < j;i++)
		{
			if (strcmp(a,c[i]) == 0)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}


}

