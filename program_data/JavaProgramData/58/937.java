package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i;
		int[] numa = new int[1000];
		int num;
		int n;
		String a = new String(new char[1]);
		a = new Scanner(System.in).nextLine();
		n = Integer.parseInt(a);
		while (true)
		{
			if (m == n)
			{
				break;
			}
			else
			{
			String zf = new String(new char[80]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			num = 0;
			zf = new Scanner(System.in).nextLine();
			for (p = zf; * p != '\0';p++)
			{
			if ((*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || (*p >= '0' && *p <= '9') || (*p == '_'))
			{
					num;
			}
				else
				{
					num++;
				}
			}
			p = zf;
			if (num != 0)
			{
				numa[m] = 0;
			}
			else
			{
				if (*p >= '0' && *p <= '9')
				{
					numa[m] = 0;
				}
				else
				{
					numa[m] = 1;
				}
			}
			m++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",numa[i]);
		}
		return 0;
	}

}
