package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int yesOrNo;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0; i < n; i++)
		{
			final String a = "";
			a = new Scanner(System.in).nextLine();
			p = a;
			yesOrNo = 0;
			if (*p == '_' || (*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z'))
			{
				for (j = 0; j < a.length(); j++)
				{
					if ((*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || (*p >= '0' && *p <= '9') || *p == '_')
					{
						p++;
					}
					else
					{
						System.out.print("0\n");
						yesOrNo = 1;
						break;
					}
				}
				if (yesOrNo == 0)
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}

