package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		int[] a = new int[501];
		int sign;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pa;
		final String str = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pj;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pk;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		len = str.length();
		for (ps = str, pa = a; ps < (str.Substring(len)); ps++, pa++)
		{
			*pa = 1;
			for (pj = ps + 1; pj < (ps + 1 + len); pj++)
			{
				sign = 0;
				for (pk = pj; pk < pj + n; pk++)
				{
					if (*pk != *(ps + (pk - pj)))
					{
						sign = 1;
						break;
					}
				}
				if (sign == 0)
				{
					(*pa)++;
				}
			}
		} //????
		for (max = 0, pa = a; pa < (a + len); pa++)
		{
			if (*pa > max)
			{
				max = pa;
			}
		}
		if (max <= 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (ps = str, pa = a; ps < (str.Substring(len)); ps++, pa++)
			{
				if (*pa == max)
				{
					for (pk = ps; pk < (ps + n); pk++)
					{
						System.out.printf("%c",*pk);
					}
					System.out.print("\n");
				}
			}
		}
	}
}

