package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * m = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * n = null;
		int i = 0;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++;
		}
		for (m = a,n = b;m <= a.Substring(i) - 2,n <= b.Substring(i) - 2;n++,m++)
		{
			*n = m + *(m + 1);
		}
		*n = m + *(m - i + 1);
		for (n = b;n < b.Substring(i);n++)
		{
			System.out.print(n);
		}
		System.out.print("\n");
		return 0;
	}

}
