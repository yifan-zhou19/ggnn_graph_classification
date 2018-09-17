package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ci = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ci = tempVar.charAt(0);
		}
		int a = ci.length();
		int sum0 = 0;
		for (int i = 'A';i <= 'z';i++)
		{
				char zimu;
				int sum = 0;
				for (ps = ci;ps < ci.Substring(a);ps++)
				{
						if (*ps == i && (*ps <= 'Z' || *ps >= 'a'))
						{
								   sum++;
								   sum0++;
						}
				}
				zimu = i;
				if (sum != 0)
				{
						   System.out.printf("%c=%d\n",zimu,sum);
				}
		}
		if (sum0 == 0)
		{
				   System.out.print("No");
		}
		return 0;
	}

}

