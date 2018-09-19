package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		String str = new String(new char[14]);
		String substr = new String(new char[14]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2 = substr;
		char max;
		int i;
		int j;
		int m;
		int n;
		int k;
		while (scanf("%s %s",str,substr) != EOF)
		{
			n = str.length();
			max = str.charAt(0);
			p1 = str;
			k = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					k = i;
				}
			}
				for (p1 = str.Substring(n) - 1;p1 > str.Substring(k);p1--)
				{
					*(p1 + 3) = *p1;
				}
				p1 = str;
				*(p1 + k + 1) = p2;
				*(p1 + k + 2) = *(p2.Substring(1));
				*(p1 + k + 3) = *(p2.Substring(2));
				for (p = str;p < str.Substring(n) + 3;p++)
				{
			System.out.printf("%c",*p);
				}
			 System.out.print("\n");
		}
		return 0;
	 }
}
