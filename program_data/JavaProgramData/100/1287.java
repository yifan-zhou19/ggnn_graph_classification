package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int[] a = new int[30];
	public static int k = 0;
	public static String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * q;
	public static int Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		q = str;

		for (i = 0;i < n;i++)
		{
			if ((*q >= 97) && (*q <= 122))
			{
				k = 1;
				a[*q - 97]++;
			}
			q++;
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",97 + i,a[i]);
			}
			}
		}
	//scanf("%d",&i);
	return 0;
	}

}

