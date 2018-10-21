package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j = 0;
		int max = 0;
		int[] sum = new int[500];
		String str = new String(new char[500]);
		char[][] smallstr = new char[500][5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (;p <= str + str.length() - n;p++)
		{
			q = smallstr[j];
			for (i = 0;i < n;i++)
			{
				*q++=*p++;
			}
			*q = '\0';
			p = p - n;
			j++;
		}
		for (i = 0;i < j - 1;i++)
		{
			for (k = i + 1;k < j;k++)
			{
				if (strcmp(smallstr[i],smallstr[k]) == 0)
				{
					sum[i] = sum[i] + 1;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			max = (max >= sum[i] != 0?max:sum[i]);
		}
		if (max == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
				System.out.print(max + 1);
				System.out.print("\n");
				for (i = 0;i < j - 1;i++)
				{
				if (sum[i] == max)
				{
						System.out.print(smallstr[i]);
						System.out.print("\n");
				}
				}
		}
		return 0;
	}
}

