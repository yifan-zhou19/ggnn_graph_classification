package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ip;
		String a = new String(new char[1000]);
		int flag = 0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
		}
		System.out.printf("%d",a.charAt(0));
		for (p = a.Substring(1);p < a.Substring(n);p++)
		{
			flag = 0;
			for (ip = p - 1;ip >= a;ip--)
			{
				if (*p == *ip)
				{
				flag = 1;
				break;
				}
			}
			if (flag == 0)
			{
				System.out.printf(",%d",*p);
			}
		}
	}

}

