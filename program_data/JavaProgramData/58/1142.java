package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int i;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
		flag = 0;
		p = a;
		if (*p == '_' || (*p >= 'a' && *p <= 'z') || *p >= 'A' && *p <= 'Z')
		{
			for (p = a.Substring(1); * p != '\0';p++)
			{
		 if (*p == '_' || (*p >= 'a' && *p <= 'z') || *p >= 'A' && *p <= 'Z' || *p >= '0' && *p <= '9')
		 {
			 ;
		 }
		 else
		 {
			 flag = 1;
		 }
			}
		 if (flag == 1)
		 {
			 System.out.print("0\n");
		 }
		 else
		 {
			 System.out.print("1\n");
		 }
		}
		else
		{
			System.out.print("0\n");
		}

		}
	}
}

