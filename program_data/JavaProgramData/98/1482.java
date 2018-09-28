package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[500][41];
		int n;
		int i;
		int k;
		int[] b = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
		String p2 = new String(new char[41]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,p2 = a,p1 = b;i < n;i++,p1++,p2++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*p2 = tempVar2.charAt(0);
			}
			b[i] = String.valueOfp2.length();
		}
		p2 = a;
		p1 = b;
		for (i = 0,k = p1 + 1;i < n - 1;i++,p2++,p1++)
		{
			k = k + *(p1 + 1);
			System.out.printf("%s",*p2);
			if (k > 80)
			{
				System.out.print("\n");
				k = (p1 + 1) + 1;
			}
			else
			{
				System.out.print(" ");
				k = k + 1;
			}
		}
		p2 = a;
		System.out.printf("%s",*(p2.Substring(n) - 1));
	}
}

