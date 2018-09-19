package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		char max;
		String ans = new String(new char[14]);
		int i;
		int k;
		int n;
		int f;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
		j = 0;
		while (scanf("%s %s",a,b) != EOF)
		{
			pa = a;
			pb = b;
			k = a.length();
			f = b.length();
			max = 0;
			for (i = 0;i < k;i++)
			{
				if (*pa > max)
				{
					max = pa;
					n = i;
					pa++;
				}
				else
				{
					pa++;
				}
			}
			i = 0;
			for (pa = a;pa < a.Substring(n) + 1;pa++)
			{
				System.out.printf("%c",*pa);
			}
			for (pb = b;pb < b.Substring(f);pb++)
			{
				System.out.printf("%c",*pb);
			}
			for (pa = a.Substring(n) + 1;pa < a.Substring(k);pa++)
			{
				System.out.printf("%c",*pa);
			}
			System.out.print("\n");
		}
	}
}
